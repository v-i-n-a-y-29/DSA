
import java.util.ArrayList;

public class FindTriangularSumOfArray {
    public static int triangularSum(int[] nums) {
        ArrayList<Integer> numsArr = new ArrayList<>();
        
        for(int num:nums){
            numsArr.add(num);
        }

        while (numsArr.size()>1) { 
            ArrayList<Integer> temp = new ArrayList<>();
            
            for(int i=0;i<numsArr.size()-1;i++)
            {
                temp.add((numsArr.get(i) + numsArr.get(i+1))%10);
            }
            numsArr=temp;
        }
        return numsArr.get(0);

    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        System.out.println(triangularSum(nums));
    }
}
