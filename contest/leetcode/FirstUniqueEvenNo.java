import java.util.*;
public class FirstUniqueEvenNo{
     public static int firstUniqueEven(int[] nums) {
        int freq[] = new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        System.out.println(Arrays.toString(freq));
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(freq[nums[i]]==1){
                    return nums[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={8,2};
        System.out.println(firstUniqueEven(nums));
    }
}