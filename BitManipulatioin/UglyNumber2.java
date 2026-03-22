
import java.util.ArrayList;
import java.util.List;

public class UglyNumber2 {
    public static  boolean isUgly(int n) {
        boolean ugly=true;
        if(n<=0)
        return false;
        while(n>1)
        {
            if(n%2==0)
            n=n/2;
            else if(n%3==0)
            n=n/3;
            else if(n%5==0)
            n=n/5;
            else
            return  false;
        }
        return true;
    }
    public static  List<Integer> nthUglyNumber(int n) {
        int count =0;
        int i=1;
        List<Integer> list=new ArrayList<>();
        while(count!=n)
        {
            if(isUgly(i))
            {
                count++;
                list.add(i);
            }
            i++;
        }
        System.out.println(--i);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(20));
    }
}
