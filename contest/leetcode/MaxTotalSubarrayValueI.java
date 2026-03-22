public class MaxTotalSubarrayValueI {
    public static long maxTotalValue(int[] nums, int k) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return (max - min) * k;
    }

    public static void main(String[] args) {
        int n = 50000, k = 100000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = (i % 2 == 0) ? 0 : 1000000000;
        System.out.println(maxTotalValue(nums, k));
    }
}
