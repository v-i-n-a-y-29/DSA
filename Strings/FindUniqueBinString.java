import java.util.HashSet;
import java.util.Set;

public class FindUniqueBinString {
    public static  String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        Set<String> set  = new HashSet<>();
        for(String str:nums){
            set.add(str);
        }
        String ans="";
        String bin="";
        for(int i=0;i<=n;i++)
        {
            bin=Integer.toBinaryString(i);
            if(!set.contains(bin)){
                ans=bin;
                break;
            }
        }
        while(ans.length()<n){
            ans="0"+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        String nums[] = {"01","10"};
        System.out.println(findDifferentBinaryString(nums));
    }
}
