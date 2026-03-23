package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenParenthesis {

    public static   List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        solve(curr,ans,n);
        return ans;
    }

    public static void solve(StringBuilder curr,List<String> ans,int n){
        //base case
        if(curr.length()==2*n){
            if(isValid(curr)){
                ans.add(curr.toString());
            }
            return;
        }

        curr.append('(');
        solve(curr, ans, n);
        curr.deleteCharAt(curr.length()-1);

        curr.append(')');
        solve(curr, ans, n);
        curr.deleteCharAt(curr.length()-1);

    }

    static boolean isValid(StringBuilder curr){
        int count=0;
        for(int i=0;i<curr.length();i++)
        {
            if(curr.charAt(i)=='(')
                count++;
            else
                count--;
            if(count<0)
                return false;
        }
        if(count==0) return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
    
    
}
