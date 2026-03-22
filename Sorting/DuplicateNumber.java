public class DuplicateNumber {
    static void sort(int []arr)
    {
        int idx=0;
        while(idx<arr.length)
        {
            int corrIdx=arr[idx]-1;
            if(arr[idx]!=arr[corrIdx])
            {
                // we swap
                swap(arr,idx,corrIdx);
            }
            else
            idx++;
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

     public static  int findDuplicate(int[] nums) {

        sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i+1!=nums[i])
            return nums[i];
        }
        return -1;
     }
    public static void main(String[] args) {
        int nums[]={3,3,3,3,3};
        System.out.println(findDuplicate(nums));
    }
}
