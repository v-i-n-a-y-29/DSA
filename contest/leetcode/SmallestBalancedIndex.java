import java.util.Arrays;

public class SmallestBalancedIndex {
    public static  int smallestBalancedIndex(int[] nums) {
        int n=nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0]=0;
        suff[n-1]=1;
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            suff[i]=suff[i+1]*nums[i+1];
        }
        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(suff));
        for(int i=0;i<n;i++)
        {
            if(pre[i]==suff[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,1,2};
        System.out.println(smallestBalancedIndex(nums));
    }
}
