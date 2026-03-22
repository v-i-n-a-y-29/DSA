import java.util.Scanner;

public class CanBeSortedORnot {
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
            for(int k=0;k<size/2;k++)
            {
                if(arr[k]==k+1)
                    continue;
                else{
                    //swap the k and 2k index
                    int temp = arr[k];
                    arr[k] = arr[2*k+1];
                    arr[2*k+1] = temp;
                }
            }
            //now checking if the numbers are at their correct positons or no
            boolean sorted = true;
            for(int l=0;l<size;l++)
            {
                if(arr[l]!=l+1)
                    sorted = false;
            }
            if(sorted==false)
                System.out.println("NO");
            else
                System.out.println("yes");
        }
    }
}
