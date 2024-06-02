package string;
//#58
public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        s=s.trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(s.length()-1-i)==' ') return i;
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("prathamesh gurav"));
    }
}
