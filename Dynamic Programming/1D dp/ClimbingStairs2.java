import java.util.Arrays;

public class ClimbingStairs2 {
   static  int dp[];
    public static   int climbStairs(int n, int[] costs) {
         dp=new int[n+1];
        Arrays.fill(dp, -1);
        return solve(-1, n, costs);
    }

    static  int solve(int i, int n, int[] costs) {
        if (i == n-1)
        {
            return 0;
        }
        if(dp[i+1]!=-1)
        return dp[i+1];
        int a = (i + 1 < n ? costs[i + 1] + 1 + solve(i + 1, n, costs) : Integer.MAX_VALUE);
        int b = (i + 2 < n ? costs[i + 2] + 4 + solve(i + 2, n, costs) : Integer.MAX_VALUE);
        int c = (i + 3 < n ? costs[i + 3] + 9 + solve(i + 3, n, costs) : Integer.MAX_VALUE);

        return dp[i+1]= Math.min(a, Math.min(b, c));
    }

    public static  void main(String[] args) {
        int costs[] = { 1, 2,3,4 };
        System.out.println(climbStairs(4, costs));
    }
}
