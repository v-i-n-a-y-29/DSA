public class MinCapacityBox {
    public static  int minimumIndex(int[] capacity, int itemSize) {
        int mini=Integer.MAX_VALUE;
        int index=-1;
        int n=capacity.length;
        for(int i=0;i<n;i++){
            if(itemSize<=capacity[i] && mini>capacity[i])
            {
                mini=capacity[i];
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int capacity[]=new int[]{4};
        int itemSize=5;
        System.out.println(minimumIndex(capacity, itemSize));
    }
}
