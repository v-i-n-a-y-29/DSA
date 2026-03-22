public class MaxSubSumk {
    public static void main(String[] args) {
        int arr[]= {2, 1, 5, 1, 3, 2};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int l=0,r=k-1;
        int maxSum=sum;
        while(r<arr.length-1)
        {
            sum-=arr[l];
            l++;
            r++;
            sum+=arr[r];
            maxSum=Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
