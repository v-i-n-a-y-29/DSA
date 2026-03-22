
public class IsPowerOfThree {
    public static  boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        while(n!=1)
        {
            if(n%3==0)
            {
                n=n/3;
            }
            else
                break;
        }
        return n==1;
        
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(Integer.MAX_VALUE-2));
    }
}
