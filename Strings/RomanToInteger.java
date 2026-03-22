public class RomanToInteger {
    public static int romanToInt(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                if(i+1<s.length()&&s.charAt(i+1)=='V')
                {
                    sum+=4;
                    i=i+1;
                    continue;
                }
                else if(i+1<s.length()&&s.charAt(i+1)=='X')
                {   
                    sum+=9;
                    i=i+1;
                    continue;
                }
                else sum+=1;
            }
            if(s.charAt(i)=='X')
            {
                if(i+1<s.length()&&s.charAt(i+1)=='L')
                {
                    sum+=40;
                    i=i+1;
                    continue;
                }
                else if(i+1<s.length()&&s.charAt(i+1)=='C')
                {   
                    sum+=90;
                    i=i+1;
                    continue;
                }
                else sum+=10;
            }
            if(s.charAt(i)=='C')
            {
                if(i+1<s.length()&&s.charAt(i+1)=='D')
                {
                    sum+=400;
                    i=i+1;
                    continue;
                }
                else if(i+1<s.length()&&s.charAt(i+1)=='M')
                {   
                    sum+=900;
                    i=i+1;
                    continue;
                }
                else sum+=100;
            }
            if(s.charAt(i)=='V')
                sum+=5;
            if(s.charAt(i)=='L')
                sum+=50;
            if(s.charAt(i)=='D')
                sum+=500;
            if(s.charAt(i)=='M')
                sum+=1000;

        }
        return sum;
    }

    public static void main(String[] args) {
        String s="MMMCC";
        System.out.println(romanToInt(s));
    }
    
}
