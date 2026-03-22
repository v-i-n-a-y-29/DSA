import java.util.ArrayList;
import java.util.List;

public class GreatestNoCandies {
     public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans =new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int after_adding=candies[i]+extraCandies;
            boolean res=true;
            for(int j=0;j<candies.length;j++)
            {
                if(after_adding<candies[j])
                {
                    res=false;
                }
            }
            ans.add(res);
        }
        return ans;
    }
    public static void main(String[] args) {
        int candies[]={4,2,1,1,2};
        int extraCandies=1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
