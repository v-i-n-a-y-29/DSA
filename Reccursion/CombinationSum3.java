import java.util.ArrayList;
import java.util.List;

class CombinationSum3 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> ans = new ArrayList<>();
        getCombinations(0, arr, n, k, new ArrayList<>(), ans);
        return ans;
    }

    static void getCombinations(int idx, int arr[], int target, int k, List<Integer> ds, List<List<Integer>> ans) {
        // base case
        if (target == 0 && ds.size() == k) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        if(idx==arr.length || target<0 || ds.size()>k)
            return;

        // pick the element
        
            ds.add(arr[idx]);
            getCombinations(idx + 1, arr, target-arr[idx], k, ds, ans);
            ds.remove(ds.size() - 1);

        // not pick
        getCombinations(idx + 1, arr, target, k, ds, ans);

    }

    public static void main(String[] args) {
        int k = 3;
        List<List<Integer>> result = combinationSum3(3, 9);
        System.out.println(result);
    }
}