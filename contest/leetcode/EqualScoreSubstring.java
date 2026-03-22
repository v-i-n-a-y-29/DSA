public class EqualScoreSubstring {
    public static  boolean scoreBalance(String s) {
        // s="adcb"
        // arr=[1,4,3,2] , sum = 10
        int arr[] = new int[s.length()];
        int arrsum = 0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            arr[i] = c-'a'+1;
            arrsum += arr[i];
        }
        int sum=0;
        for(int i =0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==(arrsum/2.0))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "kl";
        System.out.println(scoreBalance(s));
    }
}
