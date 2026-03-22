
import java.util.Arrays;


public class move0AtEnd {

    public static void swap(int l, int r, int[] nums) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0, r = 1;
        while (r < n) {
            if (nums[l] == 0 && nums[r] != 0) {
                swap(l, r, nums);
                l++;
                r++;
            }  
            else if(nums[l] == 0 && nums[r] == 0)
        {
            while (r<n && nums[r] == 0) 
            {
                r++;
            }
                if(nums[r]!=0 && r<n){
                swap(l, r, nums);
                l++;
                r++;}
        }
        else {
                l++;
                r++;
            }
        }

    }

    public static void main(String[] args) {
        int nums[]={0,0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
        int x = Integer.MIN_VALUE;
        System.out.println(x);

    }

}
