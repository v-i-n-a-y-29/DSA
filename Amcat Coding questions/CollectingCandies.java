
import java.util.PriorityQueue;


public class CollectingCandies {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        if(arr.length==1) 
        {
            System.out.println(arr[0]);
            return;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:arr)
        {
            pq.add(num);
        }
        int cost=0;
        while (pq.size()!=1) {
           int a=pq.poll();
           int b=pq.poll();
           int c=a+b;
           cost+=c;
           pq.add(c);
        }
        System.out.println(cost);
    }
}
