import java.util.*;

public class LargetPerimeterTriangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max_perimeter = 0;
        int perimeter = 0;
        for (int k = n - 1; k >= 2; k--) {
            int j = k - 1;
            while (j >= 1) {
                if (nums[j - 1] + nums[j] > nums[k]) {
                     perimeter = nums[j - 1] + nums[j] + nums[k];
                    max_perimeter = Math.max(max_perimeter, perimeter);
                    break; // no need to check smaller j, perimeter will only get smaller
                } else {
                    j--; // try smaller sides
                }
            }
        }
        return max_perimeter;

    }

    public static void main(String[] args) {
        int nums[] = { 3, 6, 2, 8, 15 };
        System.out.println(largestPerimeter(nums));
    }
}
