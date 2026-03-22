
public class TrionicArray {

    static boolean isStrictlyIncreasing(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] >= nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
    static boolean isStrictlyDecreasing(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] <= nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false; // minimum required size

        int p = -1, q = -1;

        // Find p where increasing ends
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                p = i;
                break;
            }
        }

        if (p == -1 || p == 0) return false; // no peak or peak at start

        // Find q where decreasing ends
        for (int i = p; i < n - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                q = i;
                break;
            }
        }

        if (q == -1 || q == p || q >= n - 1) return false; // no valley or valley at end

        return isStrictlyIncreasing(nums, 0, p)&& isStrictlyDecreasing(nums, p, q)&& isStrictlyIncreasing(nums, q, n - 1);
    }
    public static void main(String[] args) 
    {
        int nums[] = {2,9,5,6,6,8,9};
        System.out.println(isTrionic(nums));
    }
}
