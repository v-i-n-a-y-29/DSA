import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=arr[i])
                st.pop();
            if(st.isEmpty()) nge[i]=-1;
            else nge[i] = st.peek();
            st.push(arr[i]); 
        }
        
        for (int x : nge) {
            System.out.print(x + " ");
        }
    }
}
