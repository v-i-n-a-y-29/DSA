import java.util.*;

public class PhonePad {

   static  void letterCombo(int idx,StringBuilder str,Map<Character,String> map,String digits,List<String> ans)
    {
        if(idx==digits.length())
        {
            ans.add(str.toString());
            return;
        }

        char ch=digits.charAt(idx);
        String digiString=map.get(ch);
        for(int i=0;i<digiString.length();i++)
        {
            char c=digiString.charAt(i);
            str.append(c);
            letterCombo(idx+1,str, map, digits, ans);
            str.deleteCharAt(str.length()-1);
        }
    }

    public static  List<String> letterCombinations(String digits) {
        
        Map<Character,String> map=new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if(digits.length()==0)
        {
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        letterCombo(0,new StringBuilder(),map,digits,ans);
        return ans;

    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}
