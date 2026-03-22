import java.lang.*;
import java.util.*;
public class HouseRobber2 {
    public static  int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];

        // memoize
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        return Math.max(leaveLast(n-2,n,nums,dp1),leaveFirst(1,n,nums,dp2));
    }
    static int leaveFirst(int i,int n,int[] nums,int[] dp)
    {
        if(i>=n) return 0;
        if(i==n-1)
        return nums[n-1];
        if(dp[i]!=-1)
        return dp[i];
        int pick = nums[i] + leaveFirst(i+2, n, nums,dp);
        int not_pick = 0 + leaveFirst(i+1, n, nums,dp);
        return dp[i] = Math.max(pick, not_pick);

    }
    static int leaveLast(int i,int n,int nums[],int dp[])
    {
        if(i==0) return nums[i];
        if(i<0) return 0;
        if(dp[i]!=-1)
        return dp[i];
        int pick = nums[i] + leaveLast(i-2,n, nums,dp);
        int not_pick = 0 + leaveLast(i-1,n, nums,dp);
        return  dp[i]= Math.max(pick, not_pick); 
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(rob(nums));
    }
}
