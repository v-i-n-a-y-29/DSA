import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CouponCodeValidator {
     public static  List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<code.length;i++)
        {
            boolean coupon_isvalid=true;
            boolean business_isvalid=true;
            // validating the ith coupon
            if(code[i].equals("")){
                coupon_isvalid=false;
                continue;
            }
            for(char ch:code[i].toCharArray())
            {
                if( !((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') || ch=='_') )
                // coupon is invalid
                {
                    coupon_isvalid=false;
                    continue;
                } 
            }
            // validate the businessline
            if (!(businessLine[i].equals("electronics") || businessLine[i].equals("grocery") || businessLine[i].equals   ("pharmacy") || businessLine[i].equals("restaurant"))) {
                business_isvalid = false;
            }
            if (coupon_isvalid == true && business_isvalid == true && isActive[i] == true) {
                ans.add(code[i]);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        String[] code = {"1OFw","0MvB"};
        String[] businessLine = {"electronics","pharmacy"};
        boolean[] isActive = {true,true};
        System.out.println(validateCoupons(code, businessLine, isActive));

    }
}
