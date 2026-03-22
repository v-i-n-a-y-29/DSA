public class MinNoOfFlips {
    public static  int minimumFlips(int n) {
        String original = Integer.toBinaryString(n);
        String reverse ="";
        for(int i=original.length()-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        int count=0;
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)!=reverse.charAt(i))
                count++;
        }
        return count;
         
    }
    public static void main(String[] args) {
        System.out.println(minimumFlips(10));
    }
}
