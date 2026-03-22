class MaxDiag {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diaglen=0;
        double maxdiag=0;
        int maxArea=0;
        for(int i=0;i<dimensions.length;i++)
        {
                int len=dimensions[i][0];
                int breadth=dimensions[i][1];
                diaglen=Math.sqrt( Math.pow(len,2) + Math.pow(breadth,2) );
                int area=len*breadth;
                if (diaglen>maxdiag)
                {
                    maxdiag=diaglen;
                    maxArea=area;
                }
                else if(diaglen==maxdiag)
                {
                    maxArea=Math.max(area, maxArea);
                }
        }
        return maxArea;
    }
}