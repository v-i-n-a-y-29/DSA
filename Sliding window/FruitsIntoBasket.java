import java.util.*;
public class FruitsIntoBasket {
    public static  int totalFruit(int[] fruits) {
       int l = 0, r = 0;
    int maxlen = 0;
    Map<Integer, Integer> map = new HashMap<>();

    while (r < fruits.length) {
        map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

        while (map.size() > 2) {
            map.put(fruits[l], map.get(fruits[l]) - 1);
            if (map.get(fruits[l]) == 0) {
                map.remove(fruits[l]);
            }
            l++;
        }

        maxlen = Math.max(maxlen, r - l + 1);
        r++;
    }

    return maxlen;
    }

    public static void main(String[] args) {
        int [] fruits={3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(fruits));
    }

    
}
