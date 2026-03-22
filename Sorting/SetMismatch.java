
import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch {

    public static  int[]  findErrorNums(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(findDuplicate(nums));
        list.add(missingNumber(nums));
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    static void sort(int[] arr) {
        int idx = 0;
        while (idx < arr.length) {
            int corrIdx = arr[idx] - 1;
            if (arr[idx] != arr[corrIdx]) {
                // we swap
                swap(arr, idx, corrIdx);
            } else {
                idx++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findDuplicate(int[] nums) {

        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int missingNumber(int[] nums) {
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i+1 != nums[i]) {
                return i+1;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int nums[]={1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

}
