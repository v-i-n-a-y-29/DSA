
import java.util.Arrays;

public class Max69 {

     public static int maximum69Number (int num) {
        StringBuilder s=new StringBuilder(num+"");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='6')
            {
                s.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        // System.out.println(maximum69Number(6996));
        int n=1234;
        char ch[]=Integer.toString(n).toCharArray();
        System.out.println(Arrays.toString(ch));
        
    }
    
}
