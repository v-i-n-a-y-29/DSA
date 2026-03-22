import java.util.*;
public class MaxMex {
    public static  int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int r = ((num % value) + value) % value; // for also handling the non-negative remainder
            map.put(r, map.getOrDefault(r, 0) + 1);
        }

        int MEX = 0;

        // Increment MEX while we have available remainders
        while (map.getOrDefault(MEX % value, 0) > 0) {
            map.put(MEX % value, map.get(MEX % value) - 1);
            MEX++;
        }

        return MEX;
    }
    public static void main(String[] args) {
        int nums[]={1,-10,7,13,6,8};
        int value=5;
        System.out.println(findSmallestInteger(nums, value));
    }
}
