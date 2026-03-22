import java.util.ArrayList;
import java.util.List;

public class GenerateValidParenthesis {
    public static  List<String> generateParenthesis(int n) {
        StringBuilder curr=new StringBuilder("");
        List<String> ans = new ArrayList<>();
        generate(ans,curr, n);
        return ans;

    }

    static  boolean isValidParenthesis(StringBuilder s) {
        int count = 0;
        // Option 1: Use a traditional for loop with charAt
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // Use charAt directly on StringBuilder
            if (ch == '(')
                count++;
            else 
                count--;
            if (count < 0)
                return false;
        }
        return count == 0;
    }

    static  void generate(List<String> ans ,StringBuilder curr , int n){
        if(curr.length() == 2*n)
        {
            if(isValidParenthesis(curr)){
                ans.add(curr.toString());
            }
            return;
        }
        // add (
        curr.append('(');
        generate(ans, curr, n);
        // remove (
        curr.deleteCharAt(curr.length()-1);
        // add )
        curr.append(')');
        generate(ans, curr, n);
        curr.deleteCharAt(curr.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
