
import java.util.ArrayList;


public class SeatingArrangement {
    public static void main(String[] args) 
    {
        
        ArrayList<String> list=new ArrayList<>();
        int k=4;
        int num=1;
        while(list.size()<=100000)
        {
            if(isValid(num))
            {
                list.add(Integer.toBinaryString(num));
            }
            num++;
        }
        // System.out.println(list);
        System.out.println(list.get(k-1));
    }
    static boolean isValid(int n)
    {
        String s=Integer.toBinaryString(n);
        if(s.length()==1 && s.charAt(0)=='1') return true;
        for(int i=0;i<s.length()-1;i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if((ch1=='1' && ch2=='1'))
            {
                return false;
            }
        }
        return true;
    }
}
