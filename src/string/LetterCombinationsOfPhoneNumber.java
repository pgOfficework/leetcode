package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

	public static HashMap<Integer, String> map = new HashMap<>();

	public static List<String> letterCombinations(String digits) {

		List<String> list = new ArrayList<>();

		int num = Integer.parseInt(digits);

		for (int i = 0; i < digits.length(); i++) {

			list.add(map.get(num % 10));
			num = num / 10;

		}
		
		

		return list;

	}

	public static void main(String[] args) {
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");

		System.out.println(letterCombinations("23"));
	}

}
