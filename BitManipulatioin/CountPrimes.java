import java.util.Arrays;

class CountPrimes{

    // static boolean isPrime(int n)
    // {
    //     if(n==1)
    //     return false;
    //     if(n==2)
    //     return true;
    //     int count=0;

    //     for(int i=2;i<=n/2;i++)
    //     {
    //         if(n%i==0)
    //         count++;
    //     }
    //     if(count!=0)
    //     return false;
    //     else
    //     return  true;
    // }

     public static int  countPrimes(int n) {
        int isPrime[]= new int[n];
        Arrays.fill(isPrime, 1);
        isPrime[0]=0;
        isPrime[1]=0;
        for(int i=2;i<n;i++)
        {
            if(isPrime[i]==1)
            {
                for(int j=2*i;j<n;j+=i)
                {
                    isPrime[j]=0;
                }
            }
        }
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(isPrime[i]==1)
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}