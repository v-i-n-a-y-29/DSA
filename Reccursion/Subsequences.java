import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    public static void generateSubsequences(int[] arr, int index, List<Integer> current, List<List<Integer>> subseq) {
        // Base case: if we reach the end of array, add the current subsequence
        if (index == arr.length) {
            subseq.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: Include current element
        current.add(arr[index]);
        generateSubsequences(arr, index + 1, current, subseq);

        // Backtrack (remove the last element before the next choice)
        current.remove(current.size() - 1);

        // Choice 2: Exclude current element
        generateSubsequences(arr, index + 1, current, subseq);
    }
    public static  List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> subseq=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        generateSubsequences(candidates,0, current, subseq);
        for(List<Integer> subse:subseq)
        {
            int sum=0;
            for(int item:subse)
            {
                sum+=item;
            }
            if(sum==target)
            {
                result.add(subse);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5}; // Example input
        List<List<Integer>> result = combinationSum(arr, 8);
        System.out.println(result);
    }
}
