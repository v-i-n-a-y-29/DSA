import java.util.Arrays;

public class MedianOfSortedArrays {
    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // first we merge the two arrays
        int l=0;
        int r=0;
        int nums3[]=new int[nums1.length+nums2.length];
        int n=nums3.length;
        int idx=0;
        while(l<nums1.length && r<nums2.length){
            if(nums1[l]<=nums2[r]){
                nums3[idx++]=nums1[l++];
            }
            else {
                nums3[idx++]=nums2[r++];
            }
        }
        while(l<nums1.length){
            nums3[idx++]=nums1[l++];
        }
        while(r<nums2.length){
            nums3[idx++]=nums2[r++];
        }
        System.out.println(Arrays.toString(nums3));
        // now the array is merged  - so we take the median from the nums3
        if(n%2!=0){ //odd no of elements
             double med=nums3[n/2];
             return med;
        }
        else { //even no of elements
            double med1=nums3[n/2];
            double med2=nums3[n/2-1];
            return (med1+med2)/2;
        }
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3,4,5};
        int nums2[]={6,7,8,9,10,11,12,13,14,15,16,17};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
