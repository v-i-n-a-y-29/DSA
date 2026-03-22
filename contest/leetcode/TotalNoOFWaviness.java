public class TotalNoOFWaviness {
    public static  int totalWaviness(int num1, int num2) {
        int totwaviness=0;
        for(int i=num1;i<=num2;i++)
        {
            String num = i+"";
            int waviness=0;
            for(int j=1;j<num.length()-1;j++)
            {
                if((num.charAt(j)>num.charAt(j-1) && num.charAt(j)>num.charAt(j+1)) || (num.charAt(j)<num.charAt(j-1) && num.charAt(j)<num.charAt(j+1)) )
                {
                    waviness++;
                }
            }
            totwaviness = waviness+totwaviness;
        }
        return totwaviness;
    }
    public static void main(String[] args) {
        System.out.println(totalWaviness(120, 130));
    }
}
