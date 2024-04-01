package easy;
import java.util.HashMap;

public class Roman2Integer {

	public static void main(String[] args) {
		String s = "LVIII";

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int ans = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			char cur = s.charAt(i);
			char next = s.charAt(i + 1);

			System.out.println("cut : " + cur);
			System.out.println("next : " + next);

			if (map.get(cur) < map.get(next)) {
				ans = ans - map.get(cur);
			} else {
				ans = ans + map.get(cur);
			}
		}
		ans = ans + map.get(s.charAt(s.length() - 1));
		System.out.println(ans);

//		int ans=0,num=0;
//		
//		for (int i =s.length()-1;i>=0; i--) {
//			switch(s.charAt(i)) {
//            case 'I': num = 1; break;
//            case 'V': num = 5; break;
//            case 'X': num = 10; break;
//            case 'L': num = 50; break;
//            case 'C': num = 100; break;
//            case 'D': num = 500; break;
//            case 'M': num = 1000; break;
//        }
//			System.out.println(ans);
//			if (4 * num < ans) ans -= num;
//            else ans += num;
//		}
//		
//		System.out.println("ans : "+ans);
	}

}
