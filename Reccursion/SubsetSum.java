import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {
    public static  ArrayList<Integer> subsetSums(int[] arr) {
        int N=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        func(0, 0, arr, N, ans);
        Collections.sort(ans);
        return ans;
        
    }
    
    static void func(int idx,int sum,int arr[],int N,ArrayList<Integer> ans)
    {
        if(idx==N)
        {
            ans.add(sum);
            return;
        }
        // pick the element
        func(idx+1, sum+arr[idx], arr, N, ans);

        // donot pick the element
        func(idx+1, sum, arr, N, ans);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subsetSums(arr));
    }
}
