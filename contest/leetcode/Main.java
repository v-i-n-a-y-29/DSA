import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) b[i] = sc.nextInt();

            int iterations = 0;
            while (true) {
                // Step 1: find first index where a[i] > b[i]
                int idxDec = -1;
                for (int i = 0; i < n; i++) {
                    if (a[i] > b[i]) {
                        idxDec = i;
                        break;
                    }
                }

                boolean step1Performed = (idxDec != -1);
                if (step1Performed) {
                    a[idxDec]--;
                }

                // Step 2: find first index where a[i] < b[i]
                int idxInc = -1;
                for (int i = 0; i < n; i++) {
                    if (a[i] < b[i]) {
                        idxInc = i;
                        break;
                    }
                }
                if (idxInc != -1) {
                    a[idxInc]++;
                }

                iterations++;

                // If Step 1 was skipped, stop after this iteration
                if (!step1Performed) break;
            }

            System.out.println(iterations);
        }
        sc.close();
    }
}
