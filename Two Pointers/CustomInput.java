
import java.util.*;

public class CustomInput {
    public static void main(String[] args) {
        // Q1
        int nums[] = new int[]{1,2,3,1,2,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        //{1->3,2->2,3->1}
        //for a single number pairs = entry.value/2
        // and remaing number will be entry.value%2
        int pairs=0;
        int remaing=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            pairs+=entry.getValue()/2;
            remaing+=entry.getValue()%2;
        }
        System.out.println(pairs);
        System.out.println(remaing);

    }
}
