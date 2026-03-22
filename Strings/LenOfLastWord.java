public class LenOfLastWord {
     public static  int lengthOfLastWord(String s) {
        s=s.trim();
        System.out.println(s);
        int len=0;
        int idx=s.length()-1;
        while(idx>=0 && s.charAt(idx)!=' ')
        {
            len++;
            idx--;
        }
        return len;
        
    }

    public static void main(String[] args) {
        String s=" ";
        System.out.println(lengthOfLastWord(s));
    }
}
