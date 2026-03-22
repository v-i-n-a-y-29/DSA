import java.util.*;

public class SumOfElementsFreqDivOfK{
    public static  int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num , map.getOrDefault(num, 0)+1);
        }
        int sum=0;
        // System.out.println(map);
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            int key = en.getKey();
            int val = en.getValue();
            // System.out.println(key+","+val);
            if(val%k==0)
            {
                sum+=key*val;
            }
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2,3,3,3,3,4};
        System.out.println(sumDivisibleByK(nums, 2));
    }
    
}