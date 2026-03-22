
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<(1<<nums.length);i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if( (i & (1<<j) ) !=0 )
                list.add(nums[j]);
            }
            ans.add(list);
        }
        return ans;

    }

    public static void main(String[] args) {
        int [] nums={1,2,3};
        System.out.println(subsets(nums));
    }
}
