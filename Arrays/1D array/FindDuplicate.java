public class FindDuplicate {
    public static  int findDuplicate(int[] nums) {
        // brute force approach
        // int count =0;
        // int ans=nums[0];
        // for(int i=0;i<nums.length;i++)
        // {
        //     count=0;
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             count++;
        //         }
        //     }
        //     if(count>1)
        //     ans=nums[i];
        // }
        // return ans;
        //optimal approach
        //detecting the loop
        int slow=0,fast=0;
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        // as soon as they meet do not move the slow and move fast to the start
        // now move slow and fast normally untill they meet
        fast=0;
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int [] nums = {3,1,2,4,3};
        System.out.println(findDuplicate(nums));
    }
}
