package easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		int []nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println(removeElement1(nums,val));

	}
	public static int removeElement1(int[] nums, int val) {
		int i=0;
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]!=val) {
				nums[i]=nums[j];
				i++;
			}
		}
		return i;
	}
	public static int removeElement(int[] nums, int val) {
        List<Integer> list=new ArrayList<Integer>();
        for(Integer var : nums) {
        	System.out.println("var : "+var +" "+(var!=val));
            if(var!=val) {
            	System.out.println("vallll : "+var);
            	list.add(var);
            }
        }
        System.out.println(list);
		return list.size();
        
    }

}
