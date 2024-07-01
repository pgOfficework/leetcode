package hashtable;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        int[] alphabet = new int[26];

        if(s.length()!=t.length()) return false;

        for (char c : s.toCharArray())
            alphabet[c - 'a']++;

        for (char c : t.toCharArray()) {
            if (alphabet[c-'a']==0)
                return false;
            alphabet[c-'a']--;
        }



        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagtaram"));
    }
}
