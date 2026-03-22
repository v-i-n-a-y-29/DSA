
import java.util.Arrays;

class sorted_and_rotated
{       
    
    public static void main(String[] args) {
        int nums[]=new int[]{3,4,1,2};
        // boolean ans=check(nums);
        // System.out.println(ans);
        int nums2[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums2[i]=nums[(i+1)%nums.length];
        }
        
        System.out.println(Arrays.toString(nums2));
    }
    
    public static  boolean check(int[] nums) {
        int x=0,count=0;
        for (int i = 0; i < nums.length-1; i++) //find out the x
        {
            if(nums[i]>nums[i+1])
            {
                x=i+1;
                break;
            }
             
        }
        int nums2[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) //rotate the array by x
        {
            nums2[i]=nums[(i+x)%nums.length];
        }
        boolean flag=true;
        for (int i = 0; i < nums2.length-1; i++) //check for sorted array
        {
            if(nums2[i]>nums2[i+1])
            {
                flag=false;
            } 
        }
        return flag;
    }
}