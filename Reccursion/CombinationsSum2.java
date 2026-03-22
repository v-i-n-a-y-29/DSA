import java.util.*;

public class CombinationsSum2 {
    public static  List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> set=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(0,target,candidates,new ArrayList<>(),set);
        ans.addAll(set);
        return ans;
    }
   static  void findCombinations(int idx,int target,int arr[],List<Integer> ds,Set<List<Integer>> ans)
    {
        if(idx==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // pick the element and move to the next index
        if(arr[idx]<=target)
        {
            ds.add(arr[idx]);
            findCombinations(idx+1, target-arr[idx], arr, ds, ans);
            ds.remove(ds.size()-1);
        }

        // donot pick the element and move to the next index
        findCombinations(idx+1, target, arr, ds, ans);

    }
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> result = combinationSum2(candidates, target);
        System.out.println(result);
    }
}
