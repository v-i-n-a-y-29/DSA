public class TrappingRainWater {
    public static  int trap(int[] height) {
        int n=height.length;
        int prefixmax[]=new int[n];
        int suffixmax[]=new int[n];
        prefixmax[0]=height[0];
        suffixmax[n-1]=height[n-1];
        for(int i=1;i<n-1;i++)
        {
            prefixmax[i]=Math.max(height[i],prefixmax[i-1]);
        }
        for(int i=n-2;i>=0;i--)
        {
            suffixmax[i]=Math.max(height[i],suffixmax[i+1]);
        }
        int total=0;
        for(int i=1;i<n-1;i++)
        {
            int leftmax=prefixmax[i];
            int rightmax=suffixmax[i];
            if(height[i]<leftmax && height[i]<rightmax)
            {
                total=total+Math.min(leftmax, rightmax)-height[i];
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}
