


public class FindMissingPositive {

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static  int firstMissingPositive(int[] nums) {
        int idx=0;
        while(idx<nums.length)
        {
            int corrIdx=nums[idx]-1;
            if(corrIdx>=0 && corrIdx<nums.length && nums[corrIdx]!=nums[idx])
            {
                swap(nums, corrIdx, idx);
            }
            else
            idx++;
        }

        // System.out.println(Arrays.toString(nums));
        int j;
        for( j=0;j<nums.length;j++)
        {
            if(j+1!=nums[j])
            {
                return j+1;
            }
            
        }
        return j+1;
    }

    public static void main(String[] args) {
        int nums[]={1,2,0};
        System.out.println(firstMissingPositive(nums));
    }
    
}
