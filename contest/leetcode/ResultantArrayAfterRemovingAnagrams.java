import java.lang.reflect.Array;
import java.util.*;

public class ResultantArrayAfterRemovingAnagrams {

    public static List<String> removeAnagrams(String[] words) {
        List<String> list =new ArrayList<>();
        List<String> ans =new ArrayList<>();
        for(String word:words)
        {
            list.add(word);
            char sarray[] = word.toCharArray();
            Arrays.sort(sarray);
            String s = new String(sarray);
            ans.add(s);
        }
        int k=list.size();
        int i=0;
        while(i<k-1)
        {
            if(ans.get(i).equals(ans.get(i+1)))
            {
                ans.remove(i+1);
                list.remove(i+1);
                k--;
            }
            else 
            i++;
        }
        // System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        String words[] ={"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(words));
    }
}
