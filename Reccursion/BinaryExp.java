public class BinaryExp {
    
    static int power(int a,int b)
    {
        if(b==0)
        return 1;
        int half=power(a, b/2);
        int res=half*half;
        if(b%2==1)
        {
            res=res*a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 30));
    }
}
