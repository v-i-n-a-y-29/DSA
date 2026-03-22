public class MaxPathScoreInAGrid {
    public int maxPathScore(int[][] grid, int k) {
        int i=0;
        int j=0;
        int cost=0;
        return  solve(i,j,cost,grid);
    }
    int solve(int i,int j,int cost,int grid[][])
    {
        int m=grid.length;
        int n=grid[0].length;
        if(i==m && j==n)
        {
            return grid[i][j];
        }
        if(i>=m || j>=n)
            return Integer.MIN_VALUE;
        
            int down= i+1<m?grid[i][j]+solve(i+1, j, cost+1, grid):Integer.MIN_VALUE;
            int up = j+1<m?grid[i][j]+solve(i, j+1, cost+1, grid):Integer.MIN_VALUE;
            return Math.max(down, up);
        }
    }
    

}
