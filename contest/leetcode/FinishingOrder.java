import java.util.*;

public class FinishingOrder {
    public static  int[] recoverOrder(int[] order, int[] friends) {
        int ans[] = new int[friends.length];
        List<Integer> list = new ArrayList<>();
        for (int f : friends) {
            list.add(f);
        }
        int idx = 0;
        for (int i = 0; i < order.length; i++) {
            if (list.contains(order[i])) {
                ans[idx++] = order[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
