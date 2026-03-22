public class MaxNoOfVowelsInSubstring {
    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
        return true;
        else 
        return false;
    }
    public static  int maxVowels(String s, int k) {
        // first traverse till k elenets and set a window of size k
        // run the loop from 0 to k-1
        int n=s.length();
        int vowels=0;
        int maxVowels=0;
        for(int i=0;i<k;i++)
        {
            char c=s.charAt(i);
            if(isVowel(c))
            {
                vowels++;
            }
        }
        maxVowels=vowels;
        int left=0;
        int right=k-1;
        while(right<n-1)
        {
            char cr=s.charAt(right+1);
            if(isVowel(cr))
            vowels++;
            char cl=s.charAt(left);
            if(isVowel(cl))
            vowels--;
            maxVowels=Math.max(maxVowels, vowels);
            right++;
            left++;
        }
        return maxVowels;
    }

    public static void main(String[] args) {
        String s="a";
        System.out.println(maxVowels(s, 1));
    }
}
