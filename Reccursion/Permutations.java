import java.util.*;

public class Permutations {
    public static  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int freq[]=new int[nums.length];
        backtrack(nums,freq,new ArrayList<>() ,ans);
        return ans;

    }

    static  void backtrack(int nums[],int freq[] ,List<Integer> ds , List<List<Integer>> ans)
    {
        if(ds.size()==nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(freq[i]!=1)
            {
                freq[i]=1;
                ds.add(nums[i]);
                backtrack(nums, freq, ds, ans);
                ds.remove(ds.size()-1);
                freq[i]=0;
            }
        }

    }

    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(permute(nums));

    }
}
