import java.util.Arrays;

public class NUniqueIntegersSumToZero {
    public static void sumZero(int n) {
        int ans[] = new int[n];
        int num=1;
        // if n is even do this
        if(n%2==0)
        {
            for(int i = 0; i<n ; i++ )
            {
                ans[i] = num;
                if(i%2!=0)
                num=-num+1;
                else
                num=-num;
            }
        }
        else
        {
            for(int i = 0; i<n-1 ; i++ )
            {
                ans[i] = num;
                if(i%2!=0)
                num=-num+1;
                else
                num=-num;
            }
            ans[n-1]=0;
        }
        System.out.println(Arrays.toString(ans));
        
    }

    public static void main(String[] args) {
        sumZero(6);
    }
}
