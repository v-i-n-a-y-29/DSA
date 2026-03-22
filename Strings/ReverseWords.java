


public class ReverseWords {
    public static String reverseWords(String s) {
        s=s.trim();
        String arr[]=((s.split("\\s+")));
        StringBuilder res=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            res.append(arr[i]);
            if(i>0)
            res.append(" ");
        }
        
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "   my name is     vinay semwal  ";
        // Print the array of words as a string
        System.out.println(reverseWords(str));
    }
}
