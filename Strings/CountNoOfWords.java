public class CountNoOfWords {
    public static void main(String[] args) {
        String s="i love data structures";
        String arr[] = s.split(" ");
        int maxlen=-1;
        String longestWord="";
        for(String st:arr)
        {
            int currlen=st.length();
            if(st.length()>maxlen)
            {
                maxlen=currlen;
                longestWord=st;
            }
        }
        System.out.println(longestWord);
    }
}
