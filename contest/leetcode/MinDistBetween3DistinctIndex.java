public class MinDistBetween3DistinctIndex {
    public static  int minimumDistance(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int count=0;
            int p1=0,p2=0,p3=0;
            for(int j=i;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    if(count==0) p1=j;
                    if(count==1) p2=j;
                    if(count==2) p3=j;
                    count++;
                }
                if(count==3)
                {
                    int dist = Math.abs(p1-p2)+Math.abs(p2-p3)+Math.abs(p3-p1);
                    ans = Math.min(ans,dist);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public static void main(String[] args) {
        int nums[]={3, 3, 4, 3, 4, 3};
        System.out.println(minimumDistance(nums));
        
    }
}
