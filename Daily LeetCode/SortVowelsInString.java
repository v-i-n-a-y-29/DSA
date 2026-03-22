import java.util.*;

public class SortVowelsInString {

    public static String sortVowels(String s) {
        // HashSet<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));

        // ArrayList<Character> temp=new ArrayList<>();
        // for(char c:s.toCharArray()){
        //     if(set.contains(c)){
        //         temp.add(c);
        //     }
        // }
        // Collections.sort(temp);
        // StringBuilder res = new StringBuilder();
        // int j=0;
        // for(char c:s.toCharArray()){
        //     if(set.contains(c)){
        //         res.append(temp.get(j++));
        //     }
        //     else
        //     res.append(c);
        // }
        // return res.toString();

        // 2nd approach

     HashSet<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'));
     HashMap<Character,Integer> map = new HashMap<>();
     for(char c:s.toCharArray()){
        if(set.contains(c)){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
     }
     int j=0;
     String vowelString ="AEIOUaeiou";
     StringBuilder res = new StringBuilder();
     for(char c:s.toCharArray()){
        if(set.contains((c))){ //if it is a vowel look in the the vowelString and  map and if the freq>0 append it to the  res
             // find the next available vowel
                while (j < vowelString.length() && 
                      (!map.containsKey(vowelString.charAt(j)) || map.get(vowelString.charAt(j)) == 0)) {
                    j++;
                }

                // append the correct vowel
                if(j < vowelString.length()){
                    res.append(vowelString.charAt(j));
                    map.put(vowelString.charAt(j), map.get(vowelString.charAt(j)) - 1);
                }
        }
        else{
            res.append(c);
        }
     }
     return res.toString();


    }

    public static void main(String[] args) {
        System.out.println(sortVowels("lEetcOde"));
    }
}
