

public class CompressTheString {
    public static void main(String[] args) {
        String s="aaabbc";
        int count=0;
        boolean seen=false;
        for(int i=0;i<s.length();i++)
        {
            count=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {
                count++;
                i++;
            }
            System.out.print(s.charAt(i)+""+count);
        }
        
    }
}
