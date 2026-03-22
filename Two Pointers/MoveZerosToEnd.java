import java.util.*;

public class MoveZerosToEnd {
    public static int[] moveZeros(int[] nums){
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==0){
                int j=i+1;
                while(j<nums.length && nums[j]==0){
                    j++;
                }
                if(j == nums.length) return nums; 
                swap(i,j,nums);
            }
            i++;
        }
        return nums;
    }
    public static void swap(int i, int j , int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int nums[]={1,0,2,0,0,1};
        System.out.println(Arrays.toString(moveZeros(nums)));
    }
}
