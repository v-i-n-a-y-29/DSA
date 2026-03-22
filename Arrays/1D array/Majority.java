import java.util.HashMap;
import java.util.Map;

public class Majority {

    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);

        }
        int res=0;
        for (Map.Entry<Integer, Integer> entry:map.entrySet())
        {
            if(entry.getValue()>(n/2))
            {
                res=entry.getKey();
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
        
    }
    
}
