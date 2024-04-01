package easy;

public class LengthofLastWord {

	public static void main(String[] args) {
		String s="   fly me   to   the moon   ";
		
		System.out.println(lengthOfLastWord(s));

	}
public static int lengthOfLastWord(String s) {
//	String[] parts = s.split(" ");
//	
//	return parts[parts.length-1].length();
	int count=0;
	s=s.trim();
	for (int i = s.length()-1;i>=0; i--) {
		if(s.charAt(i)!=' ') {
			count++;
		}
		else
			break;
	}
        return count;
    }

}
