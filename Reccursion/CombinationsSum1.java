import java.util.ArrayList;
import java.util.List;

public class CombinationsSum1 {
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }

    static void findCombinations(int idx,int arr[],int target,List<Integer> ds, List<List<Integer>> ans){
        //base case
        if(idx==arr.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        // pick the elememt
        if(arr[idx]<=target)
        {
            ds.add(arr[idx]);
            findCombinations(idx,arr,target-arr[idx],ds,ans);
            ds.remove(ds.size()-1);

        }

        // donot pick
        findCombinations(idx+1,arr,target,ds,ans);
    }
    
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }
}
