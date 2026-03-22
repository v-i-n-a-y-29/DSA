import java.util.ArrayList;
import java.util.List;

public class ReplaceNonCoprimeNumbers {
    public static List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int num : nums) {
            // Add the current number to the list
            res.add(num);

            // Keep merging the last two elements as long as they are not coprime
            // and there are at least two elements in the list.
            while (res.size() > 1) {
                int last = res.get(res.size() - 1);
                int secondLast = res.get(res.size() - 2);

                int g = gcd(last, secondLast);

                // If they are coprime, we are done with this number.
                if (g == 1) {
                    break;
                }

                // If not coprime, remove the last two elements...
                res.remove(res.size() - 1);
                res.remove(res.size() - 1);

                // ...and add their LCM. The loop will continue to check this new LCM
                // against the element that came before it.
                long lcm = (long) last * secondLast / g;
                res.add((int)lcm);
            }
        }
        return res;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int nums[] = {6, 4, 3, 2, 7, 6, 2};
        // Expected output: [12, 7, 6]
        System.out.println(replaceNonCoprimes(nums));

        int nums2[] = {2,2,1,1,3,3,3};
        // Expected output: [2, 1, 1, 3]
        System.out.println(replaceNonCoprimes(nums2));
    }
}
