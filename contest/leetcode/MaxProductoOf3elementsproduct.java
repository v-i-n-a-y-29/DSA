public class MaxProductoOf3elementsproduct {
    public long maxProduct(int[] nums) {
        int count0=0;
        int count_negative=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            count0++;
            else if(nums[i]<0)
            {
                count_negative++;
            }
        }
        
    }
    public static void main(String[] args) {
        int nums[]={-5,7,0};
    }
}
