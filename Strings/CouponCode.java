
import java.util.ArrayList;
import java.util.List;

class CouponCode {

    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ans = new ArrayList<>();
        boolean code_isValid = true;
        boolean businessValid = true;
        for (int i = 0; i < code.length; i++) {
            code_isValid = true;
            businessValid = true;
            // checking for code validity
            if (code[i].isEmpty()) {
                code_isValid = false;
            }
            int idx = 0;
            while (idx < code[i].length()) {
                char ch = code[i].charAt(idx);
                if (!((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || (ch == '-'))) {
                    code_isValid = false;
                    break;
                }
                idx++;
            }

            // check for businessline
            if (!(businessLine[i].equals("electronics") || businessLine[i].equals("grocery") || businessLine[i].equals("pharmacy") || businessLine[i].equals("restaurant"))) {
                businessValid = false;
            }
            if (code_isValid == true && businessValid == true && isActive[i] == true) {
                ans.add(code[i]);
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        String[] code = {"SAVE20", "", "PHARMA5", "SAVE@20"};
        String businessLine[] = {"restaurant", "grocery", "pharmacy", "restaurant"};
        boolean isActive[] = {true, true, true, true};
        List<String> ans = validateCoupons(code, businessLine, isActive);
        System.out.println(ans);

    }
}
