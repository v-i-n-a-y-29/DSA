public class HeightChecker {
    public static  int heightChecker(int[] heights) {
        // int expected[]=new int[heights.length];
        // for(int i=0;i<heights.length;i++)
        // {
        //     expected[i]=heights[i];
        // }
        // Arrays.sort(expected);
        // int count=0;
        // for(int i=0;i<heights.length;i++)
        // {
        //     if(heights[i] != expected[i])
        //     count++;
        // }
        // return count;

        // 2nd approach
        int count[]=new int[101];
        for(int i=0;i<heights.length;i++)
        {
            count[heights[i]]++;
        }
        int expected[]=new int[heights.length];
        int j=0;
        for(int i=1;i<count.length;i++)
        {
            if(count[i]!=0)
            {
                while(count[i]>0)
                {
                    expected[j]=i;
                    j++;
                    count[i]--;
                }
            }
        }
        int freq=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i] != expected[i])
            freq++;
        }
        return freq;

    }
    public static void main(String[] args) {

        System.out.println(heightChecker(new int[]{1,1,1,4,2,1,3}));
        
    }
}
