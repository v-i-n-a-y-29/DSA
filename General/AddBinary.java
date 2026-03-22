public class AddBinary {
     public static String addBinary(String a, String b) {
        int n1=a.length()-1;
        int n2=b.length()-1;
        int t1=0;
        int t2=0,base=2;
        int sum=0,c=0;
        StringBuilder res=new StringBuilder();
        while(n1>= 0 || n2>=0)
        {
            t1=0;
            t2=0;
            if(n1>=0)
            t1=a.charAt(n1--)-'0';
            if(n2>=0)
            t2=b.charAt(n2--)-'0';
            sum=t1+t2+c;
            if(sum>=base)
            {
                sum=sum-base;
                c=1;
            }
            else
            {
                c=0;
            }
            res.append(sum);
        }
        if(c==1)
        res.append(c);
        return res.reverse().toString();

    }
    public static void main(String[] args) {
    
        System.out.println(addBinary("11", "1"));
    }
}
