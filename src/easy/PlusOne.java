package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int arr[]= {9};
		
		ArrayList<Integer> digits=new ArrayList<>();
		for (int i : arr) {
			digits.add(i);
		}
		int len=digits.size()-1;
//		System.out.println(len);
//		System.out.println(digits.get(len));
		
		if(digits.get(len)==9) {
			digits.set(len, 1);
			digits.add(0);
		}
		
		for (Integer integer : digits) {
			System.out.println(integer);
		}
		
		
	}
	 public static int[] plusOne(int[] digit) {
		 ArrayList<Integer> digits=new ArrayList<>();
		 for (int i : digit) {
				digits.add(i);
			}
		 
		 
		return digit;
	        
	    }

}
