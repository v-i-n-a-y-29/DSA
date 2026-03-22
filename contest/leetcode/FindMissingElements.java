import java.util.List;
import java.util.*;
public class FindMissingElements {
    public static  List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        List<Integer> ans = new ArrayList<>();
        int min=nums[0];
        for(int i=0;i<nums.length;)
        {
            if(nums[i]!=min)
            {
                ans.add(min);
                min++;
            }
            else
            {
                i++;
                min++;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int nums[] ={1,5};
        System.out.println(findMissingElements(nums));
    }
}
