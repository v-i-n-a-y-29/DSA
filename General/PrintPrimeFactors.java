import java.util.*;

public class PrintPrimeFactors {
    public static List<Integer> printPrime(int n)
    {
        List<Integer> list=new ArrayList<>();
        int N=n;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                list.add(i);
                while(n%i==0)
                {
                    n=n/i;
                }
            }
        }
        if(n>1)
        {
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(printPrime(17));
    }
}
