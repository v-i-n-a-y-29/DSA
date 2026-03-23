public class MaxNonNegProdInMatrix {
    public static int maxProductPath(int[][] grid) {
        int prod=1;
        int ans=solve(grid,prod,0,0);
        if(ans<0)
            return -1;
        else
        return ans;
    }

    static  int solve(int[][] grid,int prod,int i,int j)
    {
        int m=grid.length;
        int n=grid[0].length;

        if(i==m-1 && j==n-1)
        {
            return prod*grid[i][j];
        }
        if(i>=m || j>=n)
        {
            return -1;
        }

        int down=solve(grid, prod, i+1, j);
        int right=solve(grid, prod, i, j+1);
        return Math.max(down,right);
    }
    public static void main(String[] args) {
        int grid[][]={
            {1,-2,1},
            {1,-2,1},
            {3,-4,-1}
        };
        System.out.println(maxProductPath(grid));
    }
}
