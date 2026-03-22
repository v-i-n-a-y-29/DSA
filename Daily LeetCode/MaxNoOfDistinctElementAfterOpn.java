import java.util.*;

public class MaxNoOfDistinctElementAfterOpn {
    public static int maxDistinctElements(int[] nums, int k) {
        // HashSet<Integer> set = new HashSet<>();
        // Arrays.sort(nums);
        // for(int num:nums)
        // {
        //     for(int j=-k;j<=k;j++)
        //     {
        //         if(!set.contains(num+j))
        //         {
        //             set.add(num+j);
        //             break;
        //         }
        //     }
        // }
        // // System.out.println(set);
        // return set.size();

        // optimal approach
        int count=0;
        Arrays.sort(nums);
        int prev=Integer.MIN_VALUE;
        for(int num:nums)
        {
            int min_value=num-k;
            if(prev<min_value)
            {
                prev=min_value;
                count++;
            }
            else if(prev<num+k)
            {
                prev=prev+1;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={8,7,8,7,10};
        System.out.println(maxDistinctElements(nums, 1));
    }
}
