import java.util.Arrays;

public class SumOfGcdOfFormedPairs {
    public static  long gcdSum(int[] nums) {
        int mx[]=new int[nums.length];

        //calulating the max till ith index
        mx[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                mx[i]=nums[i];
                max=nums[i];
            }
            else{
                mx[i]=max;
            }
        }
        System.out.println(Arrays.toString(mx));
        int prefixGcd[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            prefixGcd[i]=gcd(nums[i], mx[i]);
        }
        Arrays.sort(prefixGcd);
        System.out.println(Arrays.toString(prefixGcd));

        long sum=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            sum+=gcd(prefixGcd[i], prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }

    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        int nums[]={3,6,2,8};
        System.out.println(gcdSum(nums));
        // System.out.println(gcd(6, 4));

    }
}
