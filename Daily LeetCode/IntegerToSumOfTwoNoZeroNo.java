import java.util.Arrays;

public class IntegerToSumOfTwoNoZeroNo {


    static boolean checkZero(int a)
    {
        String s = a+"";
        // StringBuilder s=new StringBuilder(a);
        if(s.contains("0"))
        return true;
        else
        return false;
    }

    public static int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++)
        {
            int b=n-a;
            {
                    if(!checkZero(a) && !checkZero(b))
                    {
                        return new int[]{a,b};
                    }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(100)));
    }
}
