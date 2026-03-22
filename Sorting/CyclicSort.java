import java.util.Arrays;

public class CyclicSort {
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
        int arr[]={4,3,2,7,8,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
