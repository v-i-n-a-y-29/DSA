import java.util.*;
public class CombinationsSum4 {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int target = 4;
        int dp[] = new int[target+1];
        Arrays.fill(dp,-1);
        int ans =solve(nums,target,dp);
        System.out.println(ans);
    }
    static int solve(int nums[] , int target,int dp[])
    {
        if(target==0)
            return 1;

        int count=0;
        if(dp[target]!=-1) return dp[target];
         for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=target)
            {
                 count = count+solve(nums, target-nums[i],dp);
            }
        }
        return dp[target]= count;
    }
}
