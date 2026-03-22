

public class PlusOne {
    public static  int[] plusOne(int[] digits) {
        // StringBuilder s=new StringBuilder();
        // int i=0;
        // for(int n:digits)
        // {
        //     s.append(digits[i++]);
        // }
        // String str=s.toString();
        // int n=Integer.parseInt(str)+1;
        // String ans=new String(n+"");
        // // System.out.println(ans);
        // int answer[]=new int[ans.length()];
        // for(int j=0;j<ans.length();j++)
        // {
        //     answer[j]=(ans.charAt(j)-'0');
        // }
        // // System.out.println(Arrays.toString(answer));
        // return answer;
        // above is not applicable for bigger integers

        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            // if the digit is less than 9 simply increment it by 1 and returun it
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            // if the digit is >9 simply make taht entry 0
            digits[i]=0;
        }
        // .if it is comming out of the loop that means all the digits were 9. For ex:999+1=10000
        int ans[]=new int[n+1];
        ans[0]=1;
        return ans;

    }

    public static void main(String[] args) {
        plusOne(new int[]{9,9,9,9});
    }
}
