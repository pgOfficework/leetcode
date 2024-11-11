package string;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println(palindrom("javavaj"));
    }

    private static String palindrom(String A) {

        if (A==null)
            return "No";

        int end=A.length()-1;
        for (int i = 0; i <=A.length()/2 ; i++) {
            if (A.charAt(i)!=A.charAt(end-i)){
                return "No";
            }
        }
        return "Yes";
    }
}
