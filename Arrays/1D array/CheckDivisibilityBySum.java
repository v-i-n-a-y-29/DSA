public class CheckDivisibilityBySum {
    public static  boolean checkDivisibility(int n) {
        int x=n;
        int dsum=0;
        int dpro=1;
        while(x!=0)
        {
            int rem=x%10;
            dsum=dsum+rem;
            dpro=dpro*rem;
            x=x/10;
        }
        int tsum=dsum+dpro;
        return (n%tsum==0);
    }

    public static void main(String[] args) {
        System.out.println(checkDivisibility(0));
    }
}
