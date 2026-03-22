import java.util.*;
public class FrogJump1 {
   static  int dp[];
    public static int frogJump(int[] heights) {
        int n = heights.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(0,heights,n);
    }
    static int solve(int i,int[] heights,int n)
    {
        if(i>=n-1) return 0;
        if(dp[i]!=-1) return dp[i];
        int a = i+1 < n ? Math.abs(heights[i+1]-heights[i])+ solve(i+1, heights, n):Integer.MAX_VALUE ;
        int b = i+2 < n ? Math.abs(heights[i+2]-heights[i])+ solve(i+2, heights, n):Integer.MAX_VALUE ;    
        
        return dp[i]= Math.min(a,b);
    }

    public static void main(String[] args) {
        int heights[]={2, 1, 3, 5, 4};
        System.out.println(frogJump(heights));
    }
}
