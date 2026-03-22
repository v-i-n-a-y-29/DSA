import java.util.Scanner;

public class LeastNoOfJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n<=1) 
        {
            System.out.println(0);
            return;
        }
        if(arr[0]==0)
        {
            System.out.println(0);
            return;
        }
        int jumps = 0;
        int maxReach = 0;
        int end = 0;
        for (int i = 0; i < n - 1; i++) {

            maxReach = Math.max(maxReach, i + arr[i]);

            // When we reach end of current range
            if (i == end) {
                jumps++;

                if (maxReach <= i) {
                    System.out.println(-1);
                    return;
                }

                end = maxReach;
            }
        }

        System.out.println(jumps);

       
    }
}
