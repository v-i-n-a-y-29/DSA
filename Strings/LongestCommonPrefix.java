public class LongestCommonPrefix {
    public static  String longestCommonPrefix(String[] strs) {
        String res="";
        String baseString=strs[0];
        String comparisoString="";
        if(strs.length==1)
        return strs[0];
        for(int i=0;i<strs[0].length();i++)
        {
            for(int j=1;j<strs.length;j++)
            {
                comparisoString=strs[j];
                if(i>comparisoString.length()-1 || comparisoString.length()==0 || baseString.charAt(i)!=comparisoString.charAt(i) )
                    break;
            }
            if(i>comparisoString.length()-1 || comparisoString.length()==0 || baseString.charAt(i)!=comparisoString.charAt(i) )
                    break;
            res=res+baseString.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        String [] strs={"ab","a",""};
        System.out.println(longestCommonPrefix(strs));
    }
    
}
