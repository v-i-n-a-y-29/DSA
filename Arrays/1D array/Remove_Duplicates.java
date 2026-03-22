import java.util.Arrays;

public class Remove_Duplicates {
    
    public static  void removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(nums[j]!=nums[i])
            {
                nums[i+1]=nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2};
       removeDuplicates(nums);
    }
}
