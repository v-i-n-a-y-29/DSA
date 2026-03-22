import java.util.Arrays;
import java.util.Stack;

public class NgeDifference {
    static class Pair{
        int ele;
        int idx;

        public Pair(int ele,int idx) {
            this.ele=ele;
            this.idx=idx;
        }
        
    }
    public static void main(String[] args) {
        // i/p->4 5 2 10
        // o/p->1 2 1 -1
        int arr[] = new int[]{10,10,30,40};
        int n=arr.length;
        int nge[] = new int[arr.length];
        Stack<Pair> st = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek().ele<=arr[i])
                st.pop();
            if(st.isEmpty()) nge[i]=-1;
            else nge[i]=st.peek().idx-i;
            st.push(new Pair(arr[i], i));
        }
        System.out.println(Arrays.toString(nge));

    }
}
