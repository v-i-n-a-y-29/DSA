import java.util.*;
public class Anagram {
    public static boolean is_anagram(String s,String t)
    {
        // HashMap<Character,Integer> map=new HashMap<>();
        // if(s.length()!=t.length())
        // return false;
        // for(int i=0;i<t.length();i++)
        // {
        //     map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        // }
        // for(int i=0;i<s.length();i++)
        // {
        //     char ch=s.charAt(i);
        //     if(map.containsKey(ch))
        //     {
        //         int count=map.get(ch);
        //         if(count>1)
        //         map.put(ch,count-1);
        //         else
        //         map.remove(ch);
        //     }
        // }
        // if(map.isEmpty())
        // return true;
        // else
        // return false;

        // 2nd approach
        if(s.length()!=t.length())
        return false;
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        StringBuilder res1=new StringBuilder();
        StringBuilder res2=new StringBuilder();
        for(char c:arr1)
        {
            res1.append(c);
        }
        System.out.println(res1);
        for(char c:arr2)
        {
            res2.append(c);
        }
        System.out.println(res2);
        if(res1.toString().equals(res2.toString()))
            return true;
        else 
            return false;

    }
    public static void main(String args[])
    {
        String s="listen";
        String t="silent";
        System.out.println(is_anagram(s, t));
    }
}
