public class FlowerGame {
    public static   int flowerGame(int n, int m) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(((i+j)%2)!=0)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static   void main(String[] args) {
        System.out.println(flowerGame(3, 2));
    }
}
