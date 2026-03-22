import java.util.*;
public class TwoSum {

    public static int[] twoSum(int[] nums, int target)
    {
        int arr[];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) 
        {
            int rem=target-nums[i];
            if(map.containsKey(rem))
            {
                 return new int[]{map.get(rem), i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
        
    }


    public static void main(String[] args) {
        int arr1[]=new int[]{2,6,5,8,11};
        int arr2[]=twoSum(arr1,14);
        System.out.println(Arrays.toString(arr2));

        
    }
    
}
