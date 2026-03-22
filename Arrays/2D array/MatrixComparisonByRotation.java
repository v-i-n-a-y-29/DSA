public class MatrixComparisonByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        //if we rotate the array 0 to n times it will form a cycle
        int n=mat.length;
        for(int i=0;i<4;i++)
        {
            rotate(mat);
            if(Arrays.deepEquals(mat,target))
            return true;
        }
        return false;
    }
    void rotate(int[][] mat){
        //first we will take the transpose
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        //then we will reverse each row
        for(int i=0;i<n;i++)
        {
            int l=0;
            int r=n-1;
            while(l<r){
                int temp=mat[i][l];
		        mat[i][l]=mat[i][r];
		        mat[i][r]=temp;
                l++;
                r--;
            }
        }
    }
}
