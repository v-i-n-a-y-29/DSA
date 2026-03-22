
import java.util.Arrays;

public class AssignCokkies {
    public static  int findContentChildren(int[] g, int[] s) {
        int l=0;
        int r=0;
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l<g.length && r<s.length)
        {
            if(s[r]>=g[l])
            {
                count++;
                l++;
                r++;
            }
            else
                r++;
        }
        return count;
    }

    public static void main(String[] args) {
        int []g={1,5,3,3,4};
        int []s={4,2,1,2,1,3};
        System.out.println(findContentChildren(g, s));
    }
}
