
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static  int[] asteroidCollision(int[] asteroids) 
    {
        int n=asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                st.push(asteroids[i]);  
                continue;
            }
            if(asteroids[i]<0)
            {
                boolean isalive=true;
                while(!st.isEmpty() && st.peek()>0)
                {
                    if(st.peek() < Math.abs(asteroids[i]))
                    {
                        st.pop();
                        isalive=true;
                    }
                    else if(st.peek() == Math.abs(asteroids[i]))
                    {
                        st.pop();
                        isalive=false;
                        break;
                    }
                    else if(st.peek() > Math.abs(asteroids[i]))
                    {
                        isalive=false;
                        break;
                    }
                }
                if(isalive)  st.push(asteroids[i]);
            }
            if(asteroids[i]>0)
            {
                st.push(asteroids[i]);
            }
        }
        int[] res = new int[st.size()];
        int i = st.size() - 1;
        while (!st.isEmpty()) {
            res[i--] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int asteroids[]={3, -3, 5, -5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));

    }
}
