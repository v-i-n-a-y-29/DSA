public class StackImp {
    
    static int top=-1;
    static int st[]=new int[10];

    static void push(int x){
        top=top+1;
        st[top]=x;
    }

    static int pop(){
        if(top<0)
        {
            System.out.println("Stack Underflow! Cannot pop from empty stack");
            return -1;
        }
        return st[top--];
    }
    static int peek() {
        if (top < 0) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return st[top];
    }
    static int size(){
        if(top<0)
        return -1;
        else
        return top+1;
    }


    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        System.out.println("the size is:"+size());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }
}
