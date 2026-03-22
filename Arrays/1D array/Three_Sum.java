import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int target = -nums[i];
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    // Add triplet to set — sorted order ensures uniqueness
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // Convert set to list for return
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0};
        System.out.println(threeSum(nums));  // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}
