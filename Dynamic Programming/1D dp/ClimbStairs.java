import java.util.*;
public class ClimbStairs {

   static  int dp[];
//    static  int solve(int n){
//         if(n<0)
//         return 0;
//         if(n==0)
//         return 1;
//         int one_step = solve(n-1);
//         int two_step = solve(n-2);
//         return one_step+two_step;
//     }

    static int solveMemo(int n){
        if(n<0)
        return 0;
        if(n==0)
        return 1;
        if(dp[n]!=-1){
            return dp[n];
        }
         int one_step = solveMemo(n-1);
        int two_step = solveMemo(n-2);
        return dp[n] = one_step+two_step;
    }

    public static  int climbStairs(int n) {
        //brute force approach
        // generate all the possible outcome tc-O(2^n)
        // return solve(n);

        // optimal approach - memoisation
        // dp =new int[46]; 
        // Arrays.fill(dp, -1);
        // return solveMemo(n);

        // another approach is  - tabulation
        dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];


    }
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
