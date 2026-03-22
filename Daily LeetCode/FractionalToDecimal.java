import java.util.*;
class FractionalToDecimal{
    public static  String fractionToDecimal(int numerator, int denominator) {
        StringBuilder ans = new StringBuilder();
        if(numerator<0 && denominator>0 || numerator>0 && denominator<0)
        {
            ans.append("-");
        }
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        // 4/9 = 0
        // 4/2 = 2
        // 4%9 = 4
        ans.append(num/den);
        long remainder = num%den;
        if(remainder ==0){
            return ans.toString();
        }
        ans.append(".");
        Map<Long,Integer> map = new HashMap<>();
        map.put(remainder , ans.length());
        while(remainder!=0)
        {
            remainder = remainder * 10;
            Long quo = remainder / den;
            ans.append(quo);
            remainder = remainder % den;
            if(map.containsKey(remainder)){
                int index = map.get(remainder);
                ans.insert(index, "(");
                ans.append(")");
                break;
            }
            else{
                map.put(remainder, ans.length());
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        int numerator = 4, denominator = 333;
        System.out.println(fractionToDecimal(numerator, denominator));
    }
}