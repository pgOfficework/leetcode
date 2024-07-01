package hashtable;

import java.util.HashMap;
import java.util.Map;

//290
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {

        String[] s1 = null;
        if (s.length() > 0) {
            s1 = s.split(" ");
        }
        if (pattern.length() > s1.length)
            return false;

        Map<Character, String> map = new HashMap<>();
        int i = 0;

        for (String S : s1) {
            if (i > pattern.length() - 1) return false;

            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(S)) return false;
            } else if (map.containsValue(S)) return false;
            else map.put(pattern.charAt(i), S);

            i++;
        }
        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("aaa", "aa aa aa aa"));
    }
}
