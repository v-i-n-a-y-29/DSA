
import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        int left[] = new int[n];
        int lsum=0;
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            int rsum=sum-lsum-arr[i];
            if(lsum==rsum)
            {
                ans=i;
                break;
            }
            lsum+=arr[i];
        }
         System.out.println(ans);
    }
}
