
public class ReverseWordsWithSameVowelCount {

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        int firstWordCount = countVowels(words[0]);
        for (int i = 1; i <= words.length - 1; i++) {
            int vowelCount = countVowels(words[i]);
            if (vowelCount == firstWordCount) {
                words[i]=reverse(words[i]);
            }
        }
        // System.out.println(Arrays.toString(words));
        StringBuilder st=new StringBuilder();
        for(String word: words){
            st.append(word+" ");
            // System.out.print(word+" ");
        }
        return st.toString();
    }

    static int countVowels(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    static String reverse(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        while (i <= j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "book is nice";
        System.out.println(reverseWords(s));
    }
}
