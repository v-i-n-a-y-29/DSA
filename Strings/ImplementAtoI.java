public class ImplementAtoI {
    public static int myAtoi(String s) {
        s=s.trim();
        int sign=1;
        int idx=0;

        if(s.isEmpty())
        return 0;

        if (idx<s.length() ) { 
            if(s.charAt(idx)=='+')
            {
                sign=1;
                idx++;
            }
            else if(s.charAt(idx)=='-')
            {
                sign=-1;
                idx++;
            }
            
        }
        // parsing the digits
        long num=0;
        while(idx<s.length() && Character.isDigit(s.charAt(idx)))
        {
            num=num*10+(s.charAt(idx)-'0');
            if(num*sign>Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(num*sign<Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            idx++;
        }
        return (int)num*sign;
    }
    public static void main(String args[])
    {
        String s="+047";
        System.out.println(myAtoi(s));
    }
}
