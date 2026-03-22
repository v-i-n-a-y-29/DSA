import java.util.Scanner;

public class RowsWithMaxOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//no of rows
        int m=sc.nextInt();//no of cols
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int maxcount=0;
        int row=-1;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1)
                    count++;
                if(count>maxcount)
                {
                    row=i;
                    maxcount=count;
                }
            }
        }
        System.out.println(row);
    }
}
