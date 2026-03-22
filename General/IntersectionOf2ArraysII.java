

import java.util.*;

public class IntersectionOf2ArraysII {
    public static  int[] intersect(int[] nums1, int[] nums2) {
        // Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        // Output: [4,9]

    //     ArrayList<Integer> list = new ArrayList<>();
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     for (int i = 0; i < nums2.length; i++) {
    //         list.add(nums2[i]);
    //     }
    //     // we will create an array visited which will be initialzed with 0 meaning that element has not been visited yet
    //     int visited[] = new int[nums1.length];
    //     for (int j = 0; j < nums2.length; j++) {
    //         int num = nums2[j];
    //         for (int i = 0; i < nums1.length; i++) {
    //             if(nums1[i]==num && visited[i]!=1)
    //             {
    //                 visited[i]=1;
    //                 ans.add(num);
    //                 break;
    //             }
    //         }
    //     }
    //     int arr[]=new int[ans.size()];
    //     int idx=0;
    //     for(int n:ans){
    //         arr[idx++]=n;
    //     }
    //    return arr;

    // better approach - > we will use a map that will store the nums,freq
    Map<Integer,Integer> freqMap = new HashMap<>();
    ArrayList<Integer> list=new ArrayList<>();
    for(int num:nums1){
        freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
    }

    for(int num:nums2){
        if(freqMap.containsKey(num)){
            if(freqMap.get(num)>0){
                list.add(num);
                freqMap.put(num, freqMap.get(num)-1);
            }
        }
    }
    int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;

    }
    public static void main(String[] args) {
        int nums1[]={1,2,2,1};
        int nums2[]={2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
