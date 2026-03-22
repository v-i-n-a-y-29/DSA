
public class SquareRoot {
    public static int mySqrt(int x) {
        long low=1;
        long high=x;
        long ans=1;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(mid*mid<=x)
            {
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(Integer.MAX_VALUE));
    }
}
