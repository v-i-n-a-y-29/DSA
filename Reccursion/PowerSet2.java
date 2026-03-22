import java.util.*;

public class PowerSet2 
{
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<ArrayList<Integer>> set=new HashSet<>();
        ArrayList<Integer> current=new ArrayList<>();
        Arrays.sort(nums);
        func(0, nums.length, current, nums, set);
        list.addAll(set);
         return list;
    }

    static void func(int idx,int N,ArrayList<Integer> current,int arr[],HashSet<ArrayList<Integer>> set)
    {
        if(idx==N)
        {
            set.add(new ArrayList<>(current));
            return;
        }
        // pick the element
        current.add(arr[idx]);
        func(idx+1, N, current,arr, set);

        current.remove(current.size() - 1);

        // donot pick the element
        func(idx+1, N, current, arr, set);
    }

    public static void main(String[] args) {
        int[] arr = {4,4,4,1,4};
        // HashSet<ArrayList<Integer>> set=new HashSet<>();
        // func(0, arr.length, new ArrayList<>(), arr, set);

        System.out.println(subsetsWithDup(arr));
        
    }
}
