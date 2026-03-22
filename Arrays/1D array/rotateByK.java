
import java.util.Arrays;

public class rotateByK {

   static  void swap(int arr[],int start , int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    static void reverse(int arr[],int start,int end)
    {
        while(start<=end)
        {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void rotate(int nums[],int k)
    {
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        rotate(arr,1);
        System.out.println(Arrays.toString(arr));

        
    }
    
}
