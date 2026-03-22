public class P{
    public static boolean isPrime(int x)
    {
        if(x==1)
        return false;
        else{
        int count =0;
        for(int i=2;i<x;i++)
            {
                 if(x%i==0)
                    count++;
            }
        if(count==0)
            return true;
        else 
            return false;
        }
    }
    public static  boolean checkPrimeFrequency(int[] nums) {

        for(int i=0;i<nums.length;i++)
        {
            int count =0;
            for(int j=0;j<nums.length;j++)
            {
                  if(nums[i]==nums[j])
                      count++;
            }
            if(isPrime(count))
                return true;
        }
        return false;  
    }
    public static void main(String[] args) {
        int nums[]={};
        boolean res=checkPrimeFrequency(nums);
        System.out.println(res);

    }
    
}

