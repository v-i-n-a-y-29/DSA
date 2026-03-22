import java.util.Arrays;

public class NoOfWaysToPlace2 {
    
    public static int numberOfPairs(int[][] points) {
        // this is similar to the 1st problem but the catch is that we cannot use it bec the constraints are very large and O(n^3) answer is not feasible
        // therefore we will try the optimal soln of O(n^2)
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(b[1], a[1]); // larger y first
        });

        int count=0;
        int n=points.length;
        for(int i=0;i<n;i++)
        {
            int x1=points[i][0];
            int y1=points[i][1];

            int maxY = Integer.MIN_VALUE;
            // find the lower right points
            for(int j=i+1;j<n;j++)
            {
                int x2=points[j][0];
                int y2=points[j][1];
                
                if(y2>y1) continue;

                if(y2>maxY){
                    count++;
                    maxY=y2;
                }
                
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int points[][]={{6,2},{4,4},{2,6}};
        numberOfPairs(points);
        

    }
}
