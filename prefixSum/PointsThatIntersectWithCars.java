import java.util.*;
public class PointsThatIntersectWithCars{
    public int numberOfPoints(List<List<Integer>> nums) {
        int arr[] = new int[101];
        for(List<Integer> num:nums){
            int start = num.get(0);
            int end = num.get(1);
            arr[start]++;
            arr[end+1]--;
        }
        int prefix[] = new int[101];
        int sum=0;
        for (int i = 0; i < 101; i++) {
            sum+=arr[i];
            prefix[i]=sum;
        }
        int count=0;
        for(int num:prefix)
        {
            if(num>0)
            count++;
        }
        return count;
        
    }
}