public class MinCostToSplitIntoOnes {
    public int minCost(int n) {
        return  solve(n); 
    }
    int solve(int n){
        if(n==1) 
            return 0;
        int a=n/2;
        int b=n-a;
        return a*b+solve(a)+solve(b);
    }
}
