import java.util.*;
public class nextGreater2 {
    public static int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
       int [] neg=new int[n];
       Stack<Integer> st=new Stack<>();
        //    Arrays.fill(neg,-1);
        // brute force approach
        //    for(int i=0;i<n;i++)
        //    {
        //         for(int j=(i+1)%n;j<n;j=(j+1)%n)
        //         {
        //             if(nums[j]>nums[i])
        //             {
        //                 neg[i]=nums[j];
        //                 break;
        //             }
        //             if(j==i)
        //             break;
        //         }
        //    }
        //    return neg;

        // using stack
        for(int i=2*n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek()<=nums[i%n])
                st.pop();
            if(i<n)
            {
                if(st.isEmpty())
                neg[i]=-1;
                else
                {
                    neg[i%n]=st.peek();
                }
            }
            st.push(nums[i%n]);
        }
        return neg;
    }

    public static void main(String[] args) {
        int nums[]={1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
