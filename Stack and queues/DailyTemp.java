
import java.util.Arrays;
import java.util.Stack;

public class DailyTemp {
    public static int[] dailyTemperatures(int[] temperatures) {
        // basically we have to get the nge 
        int n=temperatures.length;
        Stack<Integer> st=new Stack<>();
        int nge[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i])
            st.pop();
            if(!st.isEmpty())
            {
                nge[i]=st.peek()-i;
            }
            st.push(i);
        }
        return nge;
    }
    public static void main(String[] args) {
        int temp[]={73,74,75,71,69,72,76,73};
        int ngei[]=dailyTemperatures(temp);
        System.out.println(Arrays.toString(ngei));
    }
}
