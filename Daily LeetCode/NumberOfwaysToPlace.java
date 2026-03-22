public class NumberOfwaysToPlace {
    public static  int numberOfPairs(int[][] points) {
       int n=points.length;
       int count=0;
       for(int i=0;i<n;i++)
       {
            int x1=points[i][0];
            int y1=points[i][1];
            for(int j=0;j<n;j++)
            {
                int x2=points[j][0];
                int y2=points[j][1];
                if(i==j) continue;
                if((x2>=x1) && (y1>=y2))
                {
                    // check for the point inside the rectangle
                    boolean pointInside=false;
                    for(int k=0;k<n;k++)
                    {
                        if(k==i || k==j) continue;
                        int x3=points[k][0];
                        int y3=points[k][1];
                        if( (x1<=x3 && x3<=x2) && (y2<=y3 && y3<=y1) )
                        {
                            pointInside=true;
                            break;
                        }
                    }
                    if(!pointInside)
                    count++;
                }
                
            }

       } 
       return count;
    }

    public static void main(String[] args) {
        int point[][]={{6,2},{4,4},{2,6}};
        System.out.println(numberOfPairs(point));
    }
}
