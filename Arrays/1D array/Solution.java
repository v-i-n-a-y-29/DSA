class Solution {
    public static int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int row=0;
        int col=n-1;
        int no_of_ele=0;
        int count=0;
        while(row<m && col>=0)
        {
            if(grid[row][col]<0)
            {
                no_of_ele=m-row;
                count+=no_of_ele;
                col--;
            }
            else
            row++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int res=countNegatives(arr);
        System.out.println(res);

    }
}