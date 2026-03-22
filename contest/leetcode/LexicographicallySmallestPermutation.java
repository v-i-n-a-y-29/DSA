import java.util.*;
public class LexicographicallySmallestPermutation
{
    public String lexGreaterPermutation(String s, String target) 
    {
        TreeSet<String> set = new TreeSet<>();
        StringBuilder str =new StringBuilder("");
        generatePermute(0,str,s,target,set);
        return set.getFirst();
    }
    static void generatePermute(int idx ,StringBuilder str , String s , String target ,  TreeSet<String> set)
    {
        if(idx==s.length() && s.compareTo(target)>0)
        {
            set.add(str.toString());
            return;
        }
        str.append(s.charAt(idx));
        // pick the idx
        generatePermute(idx+1, str, s, target, set);
        str.deleteCharAt(str.length()-1);

        // not pick
        generatePermute(idx+1, str, s, target, set);
    }
    public static void main(String[] args) {
        
    }
}