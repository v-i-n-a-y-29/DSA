
public class TrapeziumPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(".");
            }
            for(int k=0;k<n;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<=n;i++) System.out.print(".");
        System.out.println();
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print(".");
            }
            for(int k=0;k<n;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
