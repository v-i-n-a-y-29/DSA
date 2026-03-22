

public class MinBitsToFlip {

    public static int minBitFlips(int start, int goal) {
        int diff=start ^ goal;
        return countSetBits(diff);
        
    }

    public static int countSetBits(int n)
    {
        int count=0;
        while (n != 0) {
            n &= (n - 1); // clear lowest set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
       System.out.println( minBitFlips(3, 4));
    }
    
}
