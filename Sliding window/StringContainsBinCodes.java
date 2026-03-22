import java.util.*;
public class StringContainsBinCodes {
     public static  boolean hasAllCodes(String s, int k) {
        // sliding windwo approach
        // a better approach could be we can use sliding window of len=k and generatae all the substrings of that window and if the number of substrings are equal to 2^k then we are succeeded else return false
        HashSet<String> set = new HashSet<>();
        int l=0;
        int r=0;
        StringBuilder st = new StringBuilder();
        while(r<k)
        {
            st.append(s.charAt(r++));
        }
        set.add(st.toString());
        while(r<s.length())
        {
            l++;
            String str=s.substring(l,r+1);
            set.add(str);
            r++;
        }
        if(set.size()==(int)Math.pow(2,k))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String s="00110110";
        int k=3;
        System.out.println(hasAllCodes(s,k));
    }
}
