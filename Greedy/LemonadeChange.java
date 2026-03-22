public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)
                five++;
            else if (bills[i] == 10) // if the bill is 10 i should have a 5 bill and if not i should return false
            {
                if (five >= 1) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else { // if the bill is 20 i should have (a 10 bill and a 5 bill) or i should have $5
                     // * 3 bills else return false
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int bills[] = { 5, 5, 5, 10, 20 };
        System.out.println(lemonadeChange(bills));
    }
}
