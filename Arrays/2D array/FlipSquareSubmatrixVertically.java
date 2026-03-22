
import java.util.Arrays;

public class FlipSquareSubmatrixVertically{
    public static int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int i=x;
        int j=x+(k-1);
        while(i<j)
        {
            for(int c=y;c<=y+(k-1);c++)
            {
                swap(i,j,c,grid);
            }
            i++;
            j--;
        }
        return grid;
    }
    public static void swap(int i,int j,int c,int grid[][])
    {
        int temp=grid[i][c];
        grid[i][c]=grid[j][c];
        grid[j][c]=temp;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {3,4,2,3},
            {2,3,4,2}
        };

        System.out.println(Arrays.toString(reverseSubmatrix(arr, 0, 2, 2)));
    }

}