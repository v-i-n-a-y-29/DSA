public class ReversePrefixWord {
    public static  String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);//gives the first occurence of the character ch
        if(index==-1) return word;
        // reverse the string from 0 till index
        int i=0;
        int j=index;
        StringBuilder str=new StringBuilder(word);
        // swap(str, 0, 3);
        // System.out.println(str);
        while(i<=j){
            swap(str,i,j);
            i++;
            j--;
        }
        return str.toString();
    }
    static void swap(StringBuilder str,int i,int j)
    {
        char ch1=str.charAt(i);
        char ch2=str.charAt(j);
        str.setCharAt(i,ch2);
        str.setCharAt(j,ch1);
    }
    public static void main(String[] args) {
        String word="abcdef";
        char ch='d';
        System.out.println(reversePrefix(word, ch));
        
    }
}
