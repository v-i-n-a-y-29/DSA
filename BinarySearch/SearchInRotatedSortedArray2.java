public class SearchInRotatedSortedArray2 {
    public static  boolean search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            // identify the sorted half  , whether left sorted or right sorted
            int mid = s + (e-s)/2;

            if(nums[mid]==target)
            {
                return true;
            }
            if(nums[s]==nums[mid] && nums[mid]==nums[e]){//shrink the window to skip the duplicated
                s++;
                e--;
            }
           else  if(nums[s]<=nums[mid]) //the left half is sorted
            {
                if(nums[s]<=target && target<=nums[mid]) //means that the target is between the s and mid thus we will search between
                e=mid-1;
                else //else the target is not in here and we should look in the other half
                s=mid+1;
            }
            else //the right half is sorted
            {
                if(nums[mid]<=target && target<=nums[e]) //means that the target is between the mid and e thus we will search between them
                s=mid+1;
                else //else the target is not in here and we should look in the other half
                e=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[]={1,0,1,1};
        System.out.println(search(nums, 0));
    }
}
