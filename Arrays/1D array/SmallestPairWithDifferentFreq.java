import java.util.*;

public class SmallestPairWithDifferentFreq {
    public static void main(String[] args) {
        int ans[] = new int[2];
        int nums[] = new int[]{20,9,24,24,11,9};
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        System.out.println(list);
        
        int first = list.get(0);
        int firstfreq = map.get(list.get(first));

        System.out.println(firstfreq);

        for(int i=1;i<list.size();i++){
            int second = list.get(i);
            int secondfreq = map.get(second);

            if(secondfreq!=first)
            {
                return new int[]{first,second};
            }

        }
        return new int[]{-1,-1};
    }
}
