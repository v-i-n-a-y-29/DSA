public class LongestBalancedSubstring1 {
    public static  int longestBalanced(String s) 
    {
        int maxlen=0;
        for(int i=0;i<s.length();i++)
        {
            int freq[]=new int[26];
            for(int j=i;j<s.length();j++)
            {
                freq[s.charAt(j)-'a']++;
                if(isBalanced(freq))
                {
                    maxlen = Math.max(maxlen, j-i+1);
                }
            }
        }
        return maxlen;
    }

   static  boolean isBalanced(int arr[])
    {
        int val=0;
        for(int f:arr){
            if(f==0) continue;
            if(val==0) 
                val=f;
            else if(val!=f) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="zzabccy";
        System.out.println(longestBalanced(s));
    }
}
