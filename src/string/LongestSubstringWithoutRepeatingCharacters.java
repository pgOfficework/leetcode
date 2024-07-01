package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) {
            return s.length();
        }

        int max = 1;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {

                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));

                } else {

                    break;
                }

            }
            if (set.size() > max) {
                max = set.size();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(obj.lengthOfLongestSubstring("au"));
    }
}
