public class Concatenate {
    public static  void sumAndMultiply(int n) {
        long sum=0;
        String num = n+"";
        String x="";
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            if(ch!='0'){
                x+=ch;
                sum=sum+(ch-'0');
            }
        }
        long number = 0;
        if(!x.isEmpty()) number=Long.parseLong(x);
        long res = number*sum;
        System.out.println(res);
    }
    public static void main(String[] args) {
        sumAndMultiply(65463628);
    }
}
