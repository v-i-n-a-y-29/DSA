public class SubstringCount {
    public static void main(String[] args) {
        String s="TodphilipsTod";
        String target = "Tod";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String subString=s.substring(i,j+1);
                if(subString.equals(target)) count++;
            }
        }
        System.out.println(count);
    }
}
