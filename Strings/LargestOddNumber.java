


public class LargestOddNumber {

    public static  String largestOddNumber(String num) 
    {
        String str="";
        for (int i = num.length()-1; i >= 0; i--)
        {
            if( (num.charAt(i)-'0')%2!=0 )
            {
                 str = num.substring(0, i + 1);
                 return str;
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String str="35427";
        String ans=largestOddNumber(str);
        System.out.println(ans);
    }

}
