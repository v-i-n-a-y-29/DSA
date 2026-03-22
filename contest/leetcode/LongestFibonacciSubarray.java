public class LongestFibonacciSubarray{
     public static  int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n<=2)
        return n;
        int currlen=2;
        int maxlen=2;
        //nums = [1,1,1,1,2,3,5,1]
        for(int i=2;i<n;i++)
        {
            if(nums[i] == nums[i-1]+nums[i-2])
            {
                currlen++;
                maxlen = Math.max(maxlen, currlen);
            }
            else
            {
                currlen=2;
            }

        }
        return maxlen;
    }

    public static void main(String[] args) {
        int nums[]={1000000000,1000000000,1000000000};
        System.out.println(longestSubarray(nums));
    }
}