public class Reverse {
     public static int reverse(int x) {
        int n=(x);
        int rev=0;
        while(n!=0)
        {
            int rem=n%10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE && rem>7))
            return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE && rem>-8))
            return 0;
            rev=rev*10+rem;
            n=n/10;
        }
       return rev;
    }
    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(2147483646));
    }
    
}
