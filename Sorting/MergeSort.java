public class MergeSort {
    public static void merge(int arr[],int s,int m,int e)
    {
        int 
    }
    public static void merge_sort(int arr[],int s,int e)
    {
        if(s>=e)
        return ;
        int mid=s+(e-s)/2;
        merge_sort(arr, s, mid);
        merge_sort(arr, mid+1, e);

        merge(arr,s,m,e);
    }
    public static void main(String[] args) {
        
    }
    
}
