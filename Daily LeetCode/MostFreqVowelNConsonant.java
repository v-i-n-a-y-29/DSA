

public class MostFreqVowelNConsonant {
    public static int maxFreqSum(String s) {
        // HashMap<Character, Integer> vowels = new HashMap<>();
        // HashMap<Character, Integer> consonant = new HashMap<>();
        // for (char c : s.toCharArray()) {
        //     if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        //         vowels.put(c, vowels.getOrDefault(c, 0) + 1);
        //     } else
        //         consonant.put(c, consonant.getOrDefault(c, 0) + 1);
        // }
        // int maxVowelFreq = 0;
        // for (Map.Entry<Character, Integer> en : vowels.entrySet()) {
        //     if (en.getValue() > maxVowelFreq) {
        //         maxVowelFreq = en.getValue();
        //     }
        // }
        // int maxConsonantFreq = 0;
        // for (Map.Entry<Character, Integer> en : consonant.entrySet()) {
        //     if (en.getValue() > maxConsonantFreq) {
        //         maxConsonantFreq = en.getValue();
        //     }
        // }
        // return maxConsonantFreq + maxVowelFreq;

        //2nd approach
        int vowels [] =new int[26];
        int consonant [] =new int[26];
        for(char c:s.toCharArray())
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels[c-'a'] = vowels[c-'a']+1;
            }
            else
                consonant[c-'a']+=1;
        }
        int maxVowelFreq=0;
        for(int i:vowels){
            if(i>maxVowelFreq){
                maxVowelFreq=i;
            }
        }
        int maxConsonantFreq=0;
        for(int i:consonant){
            if(i>maxConsonantFreq){
                maxConsonantFreq=i;
            }
        }
        return maxConsonantFreq+maxVowelFreq;


    }

    public static void main(String[] args) {
        String s = "successes";
        System.out.println(maxFreqSum(s));
    }
}
