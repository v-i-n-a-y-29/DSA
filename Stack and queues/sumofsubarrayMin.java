import java.util.*;
public class sumofsubarrayMin {
    
    static int[] findnse(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int nse[] =new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i] )
            st.pop();
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }

        return nse;

    }
    static int[] findpsee(int arr[])
    {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int psee[] =new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i] )
            st.pop();
            psee[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }

        return psee;
    }

    public static int sumSubarrayMins(int[] arr){
        long total=0;
        int n=arr.length;
        long MOD=1000000007;
        int nse[]=findnse(arr);
        int psee[]=findpsee(arr);
        for (int i = 0; i < n; i++) {
            int left=i-psee[i];
            int right=nse[i]-i;
            total=(total+(left*right*arr[i]*1L)%MOD)%MOD;
        }
        return (int)total;
    }

    public static void main(String[] args) {
        int arr[]={71,55,82,55};
        int ans=sumSubarrayMins(arr);
        System.out.println(ans);
    }
}
