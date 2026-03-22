import java.util.*;
public class VowelEncryption {
    public static void main(String[] args) {
        String s="123421";
        char vowels[]={'a','e','i','o','u'};
        char consonants[] ={
            'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'
        };
        int v=0;
        int c=0;
        HashMap<Character,Character> map = new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(!map.containsKey(ch))
            {
                if(isPrime(ch))
                {
                    map.put(ch, vowels[c++]);
                }
                else{
                    map.put(ch,consonants[v++]);
                }
            }
            sb.append(map.get(ch));
        }
        System.out.println(sb);

    }
    static boolean isPrime(char c)
    {
        return c=='2' || c=='3' || c=='5' || c=='7' ;
    }
}
