
import java.util.HashSet;
import java.util.Set;

public class MinNoOfPeopleToTeach {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> users = new HashSet<>();

        for(int [] f :friendships){
            int u1=f[0]-1;
            int[] l1 = languages[u1];
            int u2=f[1]-1;
            int [] l2 = languages[u2];
            
            // can communication happend between u1 and u2
            if(!canCommunicate(l1,l2)){
                users.add(u1);
                users.add(u2);

            }
        }
        int result = Integer.MAX_VALUE;

        for(int l=1;l<=n;l++){
            int count=0;
            for(int user:users){
                // extract the languages the user know in l1
                int l1[]= languages[user];
                if(!knows(l1, l));
                {
                    count++;
                }
            }
            result = Math.min(result, count);
        }
        return result ==Integer.MAX_VALUE ? 0 : result;
    }

    private boolean knows(int [] l1,int l2){
        for(int l:l1){
            if(l==l2)
            return true;
        }
        return false;
    }

    boolean canCommunicate(int [] l1,int [] l2){
        for (int a:l1){
            for(int b:l2){
                if(a==b)
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}
