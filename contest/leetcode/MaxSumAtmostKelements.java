import java.util.*;
public class MaxSumAtmostKelements {
     public static  int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=nums.length-1;i>=0;i--){
            if(!set.contains(nums[i]) && k>0)
            {
                sum+=nums[i];
                ans.add(nums[i]);
                set.add(nums[i]);
                k--;
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,2};
        System.out.println(Arrays.toString(maxKDistinct(nums, 3)));
    }
}
