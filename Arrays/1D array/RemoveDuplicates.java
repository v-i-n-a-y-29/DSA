public class RemoveDuplicates {
    
    static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static int removeElements(int [] nums,int val)
    {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                int j=i+1;
                while(j<nums.length && nums[j]==nums[i])
                {
                    j++;
                }
                if(j<nums.length)
                    swap(nums, i, j);
            }
        }
        for(int num:nums)
        {
            if(num!=val)
            k++;
            else 
            break;
        }
        return k;
    }
    
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        System.err.println(removeElements(nums, 2));

    }
}
