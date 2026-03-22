import java.util.Arrays;

public class Merge2dArraysBySummingValues{
    public static  int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int ans[][] = new int[n1+n2][2];
        int i=0,j=0;
        int k=0;
        while(i<n1 || j<n2)
        {
            if(i<n1 && j<n2) { 
                if(nums1[i][0]<nums2[j][0]){
                    ans[k++]=(nums1[i++]);
                }
                else if(nums1[i][0]>nums2[j][0]){
                    ans[k++]=(nums2[j++]);
                }
                else{
                    int id=nums1[i][0];
                    int val = nums1[i][1]+nums2[j][1];
                    ans[k]=new int[]{id,val};
                    i++;
                    j++;
                    k++;
                }
            }
            else if(i<n1)
            {
                ans[k++]=(nums1[i++]);
            }
            else{
                ans[k++]=(nums2[j++]);
            }
        }
        return Arrays.copyOf(ans, k);
    }

    public static void main(String[] args) {
        int nums1[][]=
        {
            {1,2},
            {2,3},
            {4,5}
        };
        int nums2[][]={
            {1,4},
            {3,2},
            {4,1}
        };
        System.out.println(Arrays.deepToString(mergeArrays(nums1, nums2)));
    }


}