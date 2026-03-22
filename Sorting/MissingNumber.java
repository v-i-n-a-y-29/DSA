



public class MissingNumber {
     public static int missingNumber(int[] nums) {
        int idx=0;
        while(idx<nums.length)
        {
            int corrIdx=nums[idx];
            if(nums[idx]<nums.length &&nums[corrIdx]!=nums[idx])
            {
                swap(nums,corrIdx,idx);
            }
            else
            idx++;
        }
        // System.out.println("the array sorted is:"+Arrays.toString(nums));
        for(int i=0;i<nums.length;i++)
        {
            if(i!=nums[i])
            return i;
        }
        return nums.length;
    }


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int nums[]={1,2,2,4};
        System.out.println(missingNumber(nums));
        // System.out.println(Arrays.toString(nums));
    }
}
