
public class LongestSubOf1 {
    // one approach can be usinf the longest subarray with atmost one zero and then
    // we can return
    // len - 1 of that subarray

    public static int longestSubarray(int[] nums) {
        int zero_count = 0;
        int l = 0;
        int r = 0;
        int maxlen = 0;
        while (r < nums.length) {
            // if (nums[r] == 0)
            //     zero_count++;
            // if (zero_count <= 1) {
            //     maxlen = Math.max(maxlen, r - l + 1);
            // } else {
            //     // shrink the window while my no of zeros are > 1
            //     while (zero_count > 1) {
            //         if (nums[l] == 0)
            //             zero_count--;

            //         l++;
            //     }
            // }
            // r++;


            // or
            if (nums[r] == 0)
                zero_count++;
            while(zero_count>1)
            {
                if(nums[l]==0)
                zero_count--;
                l++;
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        return maxlen - 1;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 0, 1, 1, 1, 0, 1 };
        System.out.println(longestSubarray(nums));
    }
}
