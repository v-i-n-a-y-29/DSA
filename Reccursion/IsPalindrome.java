public class IsPalindrome {

   static boolean ispalindrome(String s,int i)
   {
        int n=s.length();
        if(i>=n/2)
        return true;
        if(s.charAt(i)!=s.charAt(n-i-1))
        return false;
        return  ispalindrome(s, i+1);
   }
    
    

    public static void main(String[] args) {
        String s="mada";
        System.out.println(ispalindrome(s, 0));
    }
}
