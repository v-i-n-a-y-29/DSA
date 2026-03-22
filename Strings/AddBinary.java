public class AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        int i=0;
        int j=0;
        StringBuilder aa= new StringBuilder(a);
        StringBuilder bb= new StringBuilder(b);
        aa.reverse();
        bb.reverse();
        int c=0;
        int sum=0;
        int n1=0;
        int n2=0;
        StringBuilder res = new StringBuilder();
        while(i<aa.length() || j<bb.length())
        {

            if(i<aa.length()) 
                n1 = aa.charAt(i) - '0';
            else
                n1=0;
            if(j<bb.length())
                n2 = bb.charAt(j) - '0';
            else 
                n2=0;
            sum = n1+n2+c;
            if(sum>1)
            {
                sum = sum-2;
                c=1;
            }
            else{
                c=0;
            }
            res.append(sum);
            i++;
            j++;
        }
        if(c!=0)
            res.append(c);
        System.out.println(res.reverse());
    }
}
