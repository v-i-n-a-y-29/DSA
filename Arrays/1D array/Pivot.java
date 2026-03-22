

public class Pivot {

    public static  int pivotIndex(int[] nums) {
        int pivot=0;
        int n=nums.length;
        int csum[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            csum[i]=sum;
        }
        int totalsum=csum[n-1];
        int lsum,rsum;
        while(pivot<n)
        {
            
           if(pivot==0)
           {
            lsum=0;
            rsum=totalsum-csum[0];
           }
           else
           {
            lsum=csum[pivot-1];
            rsum=totalsum-lsum-nums[pivot];
           }
            if(lsum==rsum)
            {
                return pivot;
            }
            else
            pivot++;
        }
        return -1;
        
        
    }
    public static void main(String[] args) {

       int nums[] = {1000000, 1, -1, -999999};
       int pivot=pivotIndex(nums);
       System.out.println(pivot);
        
    }
}