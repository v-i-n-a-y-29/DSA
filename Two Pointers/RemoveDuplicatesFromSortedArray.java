public class RemoveDuplicatesFromSortedArray {
//     Input: nums = [0,1,1,1,1,2,2,3,3,4]
//     Output: 2, nums = [0,1,2,3,4,_,_,_,_,_]
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        while(i<nums.length)
        {
            while(j<nums.length && nums[i]==nums[j])
            {
                j++;
            }
            nums[i+1]=nums[j];
            i++;
            count++;
        }
    }

}
