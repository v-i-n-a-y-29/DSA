
public class MaxNoOfWordsUCanType {
    public static  int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        // String arr[] = text.split(" ");
        // for(String word:arr){
        //     boolean canType=true;
        //     for(char c:brokenLetters.toCharArray()){
        //         if(word.contains(""+c)){
        //             canType = false;
        //         }
        //     }
        //     if(canType){
        //         count++;
        //     }
        // }
        // return count;

        // 2nd approach
        boolean broken[] = new boolean[26];
        for(char c:brokenLetters.toCharArray())
        {
            broken[c-'a'] = true;
        }
        boolean canType=true;
        for(char c:text.toCharArray()){
            if(c==' ') //i have completed one word
            {
                if(canType)
                {
                    count++;
                }
                canType=true;
            }
            else{
                if(broken[c-'a']==true){ //the broken character is present in the word and the word cannot be typed
                    canType=false;
                }
            }
        }

        if(canType) count++;
        return count;
        
    }

    public static void main(String[] args) {
        String text = "hello world";
        System.out.println(canBeTypedWords(text, "ad"));
    }
}
