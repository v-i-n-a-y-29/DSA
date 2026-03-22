public class LeetCodeBank {
    public static int totalMoney(int n) {
        // 1,2,3,4,5,6,7 - 2,3,4,5,6,7,8 - 3,4,5,6,7,8,9 
        int money=1;
        int totalMoney=0;
        int count=0;
        while(count<=n)
        {
            for(int i=money;i<=money+6;i++)
            {
                totalMoney+=i;
                count++;
                if(count>=n) break;
            }
            if(count>=n) break;
            money++;
        }
        return totalMoney;
    }
    public static void main(String[] args) {
        System.out.println(totalMoney(1));
    }
}
