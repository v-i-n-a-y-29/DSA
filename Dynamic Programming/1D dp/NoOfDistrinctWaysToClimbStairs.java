
import java.util.*;;

public class NoOfDistrinctWaysToClimbStairs 
{
    static  long dp[] = new long[100001];
    public static long countDistinctWayToClimbStair(int nStairs) 
    {
            if(nStairs<=2)
            return nStairs;
            if(dp[nStairs]!=-1)
                return dp[nStairs];
            return dp[nStairs]=countDistinctWayToClimbStair(nStairs-1)+countDistinctWayToClimbStair(nStairs-2);
		
	}
    public static void main(String[] args) {
        Arrays.fill(dp, -1L);
        System.out.println(countDistinctWayToClimbStair(45));
    }
}
