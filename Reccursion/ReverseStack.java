import java.util.Stack;

public class ReverseStack {
     public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()){
            return ;
        }
        int top = st.pop();
        reverseStack(st);
        //insert the top at the bottom of the stack
        insertAtBottom(st,top);

    }
    static void insertAtBottom(Stack<Integer> st,int element)
    {
        if(st.isEmpty())
        {
            st.push(element);
            return;
        }
        int top=st.pop();
        insertAtBottom(st, element);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
