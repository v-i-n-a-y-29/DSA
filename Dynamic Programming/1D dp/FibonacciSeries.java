import java.util.*;
//series -> 0 1 1 2 3 5 8 13 21 ....
// fibo(1)=1
// fibo(2)=1
// fibo(3)=2

public class FibonacciSeries {


    // using reccursion - TC O(2^n)
    static int fiboRec(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fiboRec(n-1)+fiboRec(n-2);
    }


    // using memoization -  TC O(N) and SC O(N)+O(N)
    static int dp[] = new int[1000];
    static int fiboMemo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fiboMemo(n-1)+fiboMemo(n-2);
    }

    //using tabulation - TC O(N) and SC O(N)
    static int fiboTab(int n)
    {
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


    public static void main(String[] args) 
    {
        Arrays.fill(dp, -1);
        // System.out.println(fiboRec(998));
        // System.out.println(fiboMemo(998));
        System.out.println(fiboTab(998));
    }

}
