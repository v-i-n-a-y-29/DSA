
import java.util.HashSet;

public class LongestBalancedSubarray1 {
    public static  int longestBalanced(int[] nums) {
        HashSet<Integer> odd_set = new HashSet<>();
        HashSet<Integer> even_set = new HashSet<>();
        int ans=0;
        for (int i = 0; i < nums.length; i++) 
        {
            odd_set.clear();
            even_set.clear();
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]%2==0)
                {
                    even_set.add(nums[j]);
                }
                else
                {
                    odd_set.add(nums[j]);
                }
                if(odd_set.size()==even_set.size())
                {
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,2};
        System.out.println(longestBalanced(nums));
    }
}
