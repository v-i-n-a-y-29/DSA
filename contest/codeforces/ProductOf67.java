import java.util.*;
public class ProductOf67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int j=0;j<size;j++)
            {
                arr[j] = sc.nextInt();
            }
            //main code logic is here
            // if the array has 1 and 67 then yes else no
            boolean found = false;
            for(int num:arr)
            {
                if(num==67)
                {
                    found = true;
                }
            }
            if(found==false)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

    }
}
