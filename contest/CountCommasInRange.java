public class CountCommasInRange{
    public static long  countCommas(int n) {
        long count = 0;
        long base = 1000;

        while(base <= n){
            count += (n - base + 1);
            base *= 1000;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countCommas(100));
    }
}