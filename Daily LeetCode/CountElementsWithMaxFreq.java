
import java.util.*;

public class CountElementsWithMaxFreq {
    public static  int maxFrequencyElements(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int num:nums){
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }
        // int highestFreq =1;
        // for(int freq:map.values()){
        //     if(freq>highestFreq){
        //         highestFreq = freq;
        //     }
        // }
        // int count=0;
        // for(int freq:map.values()){
        //     if(freq==highestFreq){
        //         count+=freq;
        //     }
        // }
        // return count;

        // 2nd approach using hash array
        int freq[] = new int[101]; //total constraint is that nums[i] will be less than 100
        for(int num:nums)
        {
            freq[num]++;
        }
        int highestFreq = 1;
        for(int fre:freq){
            if(fre>highestFreq){
                highestFreq=fre;
            }
        }
        int count=0;
        for(int fre:freq){
            if(fre==highestFreq){
                count=count+fre;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
}
