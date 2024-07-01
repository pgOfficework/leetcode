package string;

import java.util.HashMap;
import java.util.Map;

//383
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        int [] alphabet=new int[26];


        for (char c:magazine.toCharArray()){
            alphabet[c-'a']++;

        }

        for (char c: ransomNote.toCharArray()) {
            if (alphabet[c-'a']==0)
                return false;
            else
                alphabet[c-97]--;
        }




//        Map<Character,Integer> map=new HashMap<>();
//
//        for (Character c:magazine.toCharArray()) {
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c) + 1);
//            } else {
//                map.put(c, 1);
//            }
//        }
//        for (Character c:ransomNote.toCharArray()){
//            if (!map.containsKey(c))
//                return false;
//            else if (map.get(c)==1)
//                map.remove(c);
//            else map.put(c,map.get(c)-1);
//        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
}
