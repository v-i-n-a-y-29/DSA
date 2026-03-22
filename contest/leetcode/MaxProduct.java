public class MaxProduct {

    public static long maxProduct(int[] nums) {
        long maxP = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] & nums[j]) == 0) { // check AND first
                    long p = 1L* nums[i] * nums[j];
                    if (p > maxP) {
                        maxP = p;
                    }
                }
            }
        }
        return maxP;
    }

    public static void main(String[] args) {
        int nums[] = {1073741824, 2147483647 };
        System.err.println(maxProduct(nums));
    }
}
