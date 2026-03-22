
public class FormattingLargeProducts {
    public static void main(String[] args) {
        int A=1;
        int B=4;
        int prod=1;
        for(int i=A;i<=B;i++)
        {
            prod*=i;
        }
        int count=0;
        while(prod%10==0) 
        {
            count++;
            prod/=10;
        }
        System.out.println(prod+" "+count);
    }
        
}