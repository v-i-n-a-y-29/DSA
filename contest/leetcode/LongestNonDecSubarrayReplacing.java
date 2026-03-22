public class LongestNonDecSubarrayReplacing {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        int ans=0;
        while(j<nums.length)
        {
            if(nums[j]<nums[j-1] && count<1)
            {
                nums[j]=nums[j-1]+1;
                count++;
                ans=Math.max(ans,j-i+1);
            }
            j++;
        }
        return ans;
    }
}
