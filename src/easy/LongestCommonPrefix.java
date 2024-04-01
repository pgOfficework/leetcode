package easy;
import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String strs[] = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
    public static String longestCommonPrefix(String[] strs) {
    	Arrays.sort(strs);
    	for (String string : strs) {
			System.out.println(string);
		}
    	String s1=strs[0];
    	String s2 = strs[strs.length-1];
    	System.out.println(s2);
//        int size=10;
//        String s="";
//        char c='a';
//        for(int i=0;i<strs.length;i++){
//            size=(strs[i].length()<size)?strs[i].length():size;
//        }
//
//    System.out.println(size);
//
//       for (int i = 0; i <size; i++) {
//			for (int j = 0; j <strs.length; j++) {
//                if(j==0){
//                    c=strs[j].charAt(i);
//                }
//                else{
//                    if(c!=strs[j].charAt(i)) {
//                        return s;
//                    }
//                    else {
//                    	System.out.println("s : "+s);
//                        
//                    }
//                }
//			}
//			s=s+c;
//
//		}
        return "";
    }
}
