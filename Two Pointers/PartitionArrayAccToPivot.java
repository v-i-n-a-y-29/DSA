import java.util.*;
public class PartitionArrayAccToPivot {
    public static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        int count=0;
        for(int num:nums){
            if(num<pivot) listA.add(num);
            else if(num>pivot) listB.add(num);
            else count++;
        }
        int ans[] = new int[listA.size()+listB.size()+count];
        int i=0;
        for(int num:listA){
            ans[i]=num;
            i++;
        }
        while(count>0){
            ans[i]=pivot;
            count--;
            i++;
        }
        for(int num:listB){
            ans[i]=num;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }
}
