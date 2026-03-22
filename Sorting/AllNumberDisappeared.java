import java.util.ArrayList;
import java.util.List;

public class AllNumberDisappeared {
    public static  List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<nums.length;j++)
        {
            if(j+1!=nums[j])
            list.add(j+1);

        }
        return list;
    }
    static void sort(int []arr)
    {
        int idx=0;
        while(idx<arr.length)
        {
            int corrIdx=arr[idx]-1;
            if(arr[idx]!=arr[corrIdx])
            {
                // we swap
                swap(arr,idx,corrIdx);
            }
            else
            idx++;
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int nums[]={1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
