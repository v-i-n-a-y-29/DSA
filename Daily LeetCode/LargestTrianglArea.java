public class LargestTrianglArea {
     public static double largestTriangleArea(int[][] points) {
        double area=0;
        double max_area=0;
        for(int i=0;i<points.length-2;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            for(int j=i+1;j<points.length-1;j++){
                int x2=points[j][0];
                int y2=points[j][1];
                for(int k=j+1;k<points.length;k++){
                    int x3=points[k][0];
                    int y3=points[k][1];
                    area=0.5*Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2));
                    if(area>max_area){
                        max_area=area;
                    }
                }
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea(points));
    }
}
