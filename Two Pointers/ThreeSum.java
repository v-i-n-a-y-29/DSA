import java.util.*;

public class ThreeSum {
    public static  void threeSum(int[] nums) {
        //nums[i]+nums[j]=-(nums[k] or target)
        HashSet<ArrayList<Integer>> ans = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third = -(nums[i]+nums[j]);
                if(set.contains(third)){
                    ArrayList<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i],nums[j],third));
                    Collections.sort(triplet);
                    ans.add(triplet);
                }
                else{
                    set.add(nums[j]);
                }
            }

        }
        // System.out.println(ans);
        List<List<Integer>> list = new ArrayList<>();
        for(ArrayList<Integer> l:ans){
            list.add(l);
        }
        System.out.println(list);
        
    }
    public static void main(String[] args) {
        // System.out.println("hello");
        int nums[]={-1,0,1,2,-1,-4};
        threeSum(nums);

    }
}
