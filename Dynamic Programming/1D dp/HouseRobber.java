public class HouseRobber {
    static int dp[];
    public static  int rob(int[] nums) {
        int n = nums.length;
        dp=new int[n+1];
        java.util.Arrays.fill(dp, -1);
        // return solve(n-1,nums);

        // tabulation
        // dp[0]=nums[0];
        // if(nums.length==1) return dp[0];
        // dp[1]=Math.max(nums[0], nums[1]);
        // for(int k=2;k<nums.length;k++)
        // {
        //     int pick=nums[k]+dp[k-2];
        //     int not_pick=0 + dp[k-1];
        //     dp[k] = Math.max(pick, not_pick);
        // }
        // return dp[nums.length-1];

        // tabulation  - space optimisation
        int prev2=nums[0];
        if(nums.length==1) return prev2;
        int prev=Math.max(nums[0], nums[1]);
        for(int k=2;k<nums.length;k++)
        {
            int pick=nums[k]+prev2;
            int not_pick=0 + prev;
            int curri = Math.max(pick, not_pick);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
   static  int solve(int i , int nums[])
    {
        // memoization
        if(i==0) return nums[i];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = nums[i] + solve(i-2, nums);
        int not_pick = 0 + solve(i-1, nums);
        return dp[i]= Math.max(pick, not_pick);      
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(rob(nums));
    }
}
