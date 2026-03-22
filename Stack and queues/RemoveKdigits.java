import java.util.*;
public class RemoveKdigits {
      public static  String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && (st.peek()>num.charAt(i) && k>0))
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k>0) {
           st.pop();
           k--;
        }
         if(st.isEmpty()){
            return "0";
        }
        String result="";
        while(!st.isEmpty()){
            result+=st.pop();
        }
          String res = "";
        int index;
        for(index=result.length()-1;index>0;index--){
            if(result.charAt(index)!='0'){
                break;
            }
        }
        for(int i=index;i>=0;i--){
            res+=result.charAt(i);
        }
        return res;
      }

      public static void main(String[] args) {
        String num="1432219";
        System.out.println(removeKdigits(num, 3));
      }
}
