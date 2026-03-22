import java.util.*;
public class OneAndZeros {
    public int findMaxForm(String[] strs, int m, int n) {
        int zeroCount=0;
        int oneCount=0;
        int count=0;
        // strs = ["10","0","1"], m=1,n=1
        //str = "10"
        // zeroCount = 1, oneCount = 1
        // ans=["10"]
        // count=1
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            for(int j=0;j<str.length();j++)
            {
                if(zeroCount==m &&  oneCount==n)
                {
                    break;
                }
                else if(zeroCount<m && oneCount<n)
                {
                    if(str.charAt(j)=='0')
                    zeroCount++;
                    else
                    oneCount++;
                    ans.add(str);
                    count++;
                }
                

            }
        }
    }
    public static void main(String[] args) {
        
    }
}
