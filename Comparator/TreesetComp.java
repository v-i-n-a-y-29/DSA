import java.util.*;
public class TreesetComp {
    static class Pair{
        int first;
        int second;
        Pair(int f,int s){
            this.first=f;
            this.second=s;
        }
    }
    public static void main(String[] args) {
        Set<Pair> set=new TreeSet<>((a,b)->{
            if(a.first!=b.first)
            return b.first-a.first;
            else
            return b.second- a.second;
        });
        set.add(new Pair(1,2));
        set.add(new Pair(2, 5));
        set.add(new Pair(1, 3));
        set.add(new Pair(2, 2));

        for(Pair p:set){
            System.out.println(p.first + " " + p.second);
        }


    }
}
