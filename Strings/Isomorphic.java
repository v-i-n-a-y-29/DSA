import java.util.HashMap;

public class Isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ss=s.charAt(i);
            char tt=t.charAt(i);
            if(!map1.containsKey(ss))
            {
                map1.put(ss, tt);
            }
            if(!map2.containsKey(tt))
            {
                map2.put(tt, ss);
            }
            if(map1.get(ss)!=tt || map2.get(tt)!=ss)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abac";
        String t="abcd";
        System.out.println(isIsomorphic(s,t));
    }
}
// egg,add
// e-a
// g-d
