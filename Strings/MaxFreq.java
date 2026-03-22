import java.util.Arrays;

public class MaxFreq {
    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int res=Integer.MIN_VALUE;
        int n=nums.length;
        int s=0;
        int e=0;
        int sum=0;
        while(e<n)
        {
            sum=sum+nums[e];
            if(k+sum>nums[e]*(e-s+1))
            {
                e++;
            }
            else
            {
                sum=sum-nums[s++];
            }
            res=Math.max(res,e-s+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[]={1,4,8,13};
       int res= maxFrequency(nums, 5);
        System.out.println(res);
        
    }
}
