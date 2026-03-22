public class MakeArrayElement0 {
    // private static  int   isValid(int[] nums , int dir , int curr)
    // {
    //     int n = nums.length;
    //     while(curr>=0 && curr<n){
    //         if(nums[curr]==0) curr++;
    //         else{
    //             nums[curr]--;
    //             if(dir==1)
    //             dir = -1;
    //             else
    //             dir = 1;
    //         }
    //         curr+=dir;
    //     }
    //     int flag = 0;
    //     for(int i:nums)
    //     {
    //         if(i!=0)
    //         {
    //             flag=0;
    //             break;
    //         }
    //     }
    //     return flag;
    // }
    // public static  int countValidSelections(int[] nums) {
    //     int count=0;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(nums[i]!=0)
    //         {
    //             continue;
    //         }
    //         count+=isValid(nums , -1, i);
    //         count+=isValid(nums , -1, i);
    //     }
    //     return count;

    // optimal code
    public static int countValidSelections(int[] nums)
    {
        int count = 0;
        int sum =0;
        for(int num:nums)
        {
            sum+=num;
        }
        int left_sum = 0;

        for(int i=0;i<nums.length;i++)
        {
            left_sum +=nums[i];
            if(nums[i]==0)
            {
                if(left_sum==(sum-left_sum))
                {
                    count+=2;
                }
                else if(Math.abs(left_sum-(sum-left_sum))==1)
                {
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}
