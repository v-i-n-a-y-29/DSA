import java.util.ArrayList;
import java.util.List;

public class CombinationsSum2app2 {
    
     public static  List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }

    static void findCombinations(int idx,int arr[],int target,List<Integer> ds, List<List<Integer>> ans){
        //base case
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
        }
        // pick the elememt
        for(int i=idx;i<arr.length;i++)
        {
            if(i>idx && arr[i]==arr[i-1]) continue;

            if(arr[i]>target) break;

            ds.add(arr[i]);
            findCombinations(i+1, arr, target-arr[i], ds, ans);
            ds.remove(ds.size()-1);
        }
    }
    
    public static void main(String[] args) {
        int[] candidates = {1,1,1,2,2};
        int target = 4;
        List<List<Integer>> result = combinationSum2(candidates, target);
        System.out.println(result);
    }
}
