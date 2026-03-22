import java.util.*;
public class MinCostOfCllimbingStairs {
    
    static int dp[] = new int[1001];
    static 
    {
        Arrays.fill(dp, -1);
    }
    public static  int minCostClimbingStairs(int[] cost) {
        return Math.min(solve(0,cost),solve(1,cost));
    }
    static int solve(int idx,int [] cost)
    {
        if(idx>=cost.length)
        return 0;
        if(dp[idx]!=-1)
        {
            return dp[idx];
        }
        int a = cost[idx] + solve(idx+1, cost);
        int b = cost[idx] + solve(idx+2, cost);
        return dp[idx]= Math.min(a,b);
    }
    public static void main(String[] args) 
    {
        int cost[]={1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }
}
