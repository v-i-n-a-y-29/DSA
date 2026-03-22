import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
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

     public static  List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i+1!=nums[i])
            list.add( nums[i]);
        }
        return list;
     }
    public static void main(String[] args) {
        int nums[]={1};
        System.out.println(findDuplicates(nums));
    }
}
