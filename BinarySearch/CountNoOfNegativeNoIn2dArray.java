public class CountNoOfNegativeNoIn2dArray {
    public static  int countNegatives(int[][] grid) {
        int count =0;
        for(int i=0;i<grid.length;i++)
        {
            // now traverse each row and check for the negative number 
            int row[] = grid[i];
            int low = 0;
            int high = row.length;
            while(low<=high){
                int mid = (low +high)/2;
                if(row[mid]<0)
                {
                    high = mid -1;
                }
                else{
                    low = mid+1;
                }
            }
            count = count +row.length - low;
        }
        return count;
    }
    public static void main(String[] args) {
        int grid [][] = {
            {4,3,2,-1},
            {3,2,1,-1},
            {1,1,-1,-2},
            {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
}
