package hashtable;

import java.util.HashMap;
import java.util.Map;

//205
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();

        int[] arrS = new int[26];
        int[] arrT = new int[26];

        int i = 0;

        while (i < s.length()) {
            if (arrS[s.charAt(i) - 'a'] != 0) {
                if (arrS[s.charAt(i) - 'a'] != t.charAt(i)) {
                    return false;
                }
            } else if (arrT[t.charAt(i) - 'a'] != 0) {
                return false;
            } else {
                arrS[s.charAt(i) - 'a'] = t.charAt(i);
                arrT[t.charAt(i) - 'a'] = s.charAt(i);

            }
            i++;
        }

//        while (i<arrS.length){
//            if (map.containsKey(arrS[i])){
//                if (map.get(arrS[i])!=arrT[i]){
//                    return false;
//                }
//            } else if (map.containsValue(arrT[i])) {
//                return false;
//            } else map.put(arrS[i],arrT[i]);
//            i++;
//        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }
}
