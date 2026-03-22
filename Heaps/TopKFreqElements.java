import java.util.*;
class Pair{
    int element;
    int frequency;

    public Pair(int element,int frequency) {
        this.element=element;
        this.frequency=frequency;
    }
    
}
public class TopKFreqElements {

     public static void topKFrequent(int[] nums, int k) 
     {
        Queue<Pair> pq = new PriorityQueue<>((a,b)-> b.frequency-a.frequency);
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            Pair pair = new Pair(entry.getKey(), entry.getValue());
            pq.offer(pair);
        }
        int idx=0;
        int ans[] = new int[k];
        while(idx<k)
        {
            // System.out.println(pq.poll().element);
            ans[idx]=pq.poll().element;
            idx++;
        }
        // now u can print the answer array


    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        // System.out.println(nums[0]);
        topKFrequent(nums, 2);
    }
}
