public class DivideNumbers {
    public static int divide(int dividend, int divisor) {
        if(dividend==divisor)
        return 1;
        int sign=1;

        // checking the edge cases
        if(dividend==Integer.MAX_VALUE && divisor==-1)
        return -Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        if(divisor==1)
        return dividend;
        if(divisor==-1)
        return -dividend;

        // checking for +ve and -ve values
        if(dividend <0 && divisor>0 || divisor <0 && dividend>0)
        sign=-1;

        
        long n=Math.abs((long) dividend);
        long d=Math.abs((long) divisor);
        int ans=0;
        while(n>=d)
        {
            int count=0;
            while( (d<<(count+1)) <= n)
            {
                count++;
            }
            ans=ans+(1<<count);
            n=n-(d<<count);
        }

        if(ans>=Integer.MAX_VALUE  && sign==1)
        return Integer.MAX_VALUE;
        if(ans >= Integer.MAX_VALUE && sign == -1)
        return Integer.MIN_VALUE;

        return sign*ans;
    }
    public static void main(String[] args) {
        System.out.println(divide(2147483647, -1));
    }
}
