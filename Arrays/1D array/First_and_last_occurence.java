
import java.util.Arrays;

 class First_and_last_occurence
{
    // public static int lowerBound(int[] nums,int target)
    // {
    //     int s,e;
    //     s=0;
    //     e=nums.length-1;
    //     int ans=-1;
    //     while(s<=e)
    //     {
    //         int mid=s+(e-s)/2;
    //         if(nums[mid]>=target)
    //         {
    //             ans=mid;
    //             e=mid-1;
    //         }
    //         else
    //         {
    //             s=mid+1;
    //         }
    //     }
    //     return ans;
    // }
    // public static int upperbound(int[] nums,int target)
    // {
    //     int s,e;
    //     s=0;
    //     e=nums.length-1;
    //     int ans=-1;
    //     while(s<=e)
    //     {
    //         int mid=s+(e-s)/2;
    //         if(nums[mid]>target)
    //         {
    //             ans=mid;
    //             e=mid-1;
    //         }
    //         else
    //         {
    //             s=mid+1;
    //         }
    //     }
    //     return s;
    // }
    

    // public static int[] searchRange(int[] nums, int target) 
    // {
    //     int n=nums.length;
    //     // first calc the lb and that will the first occurence of our element
    //     int lb=lowerBound(nums, target);
    //     // then we will calc the ub-1 and that will be the last occ of our element
    //     int ub=upperbound(nums, target);
        
    //     if(lb==-1|| lb>n || nums[lb]!=target)
    //     {
    //         return new int[]{-1,-1};
    //     }
    //     int lastOccurence;
    //     if(ub==-1)
    //      lastOccurence=-1;
    //     else
    //         lastOccurence=ub-1;
    //     return new int[] {lb, lastOccurence};
    // }
    public static int first_occ(int[] nums,int target)
    {
        int low=0,high=nums.length-1;
        int first=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            if (nums[mid] == target) {
                first = mid; // ✅ Save only if nums[mid] == target
            }
        }
        return first;
    }
    public static int last_occ(int[] nums,int target)
    {
        int low=0,high=nums.length-1;
        int last=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            if (nums[mid] == target) {
                last = mid; // ✅ Save only if nums[mid] == target
            }
        }
        return last;
    }

    public static int[] searchRange(int[] nums,int target)
    {
        int first=first_occ(nums, target);
        int last=last_occ(nums, target);
        if(first==-1 || nums[first]!=target)
        return new int[]{-1,-1};
        else
        return new int[]{first,last};
    }


    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10};
        int ans[]=searchRange(nums, 8);
        System.out.println(Arrays.toString(ans));
        
    }
}