package easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int i : nums) {
            set.add(i);
        }
//        List<String> al=new ArrayList<Integer>(set); 
//        for(int i=size;i>set.size();i++) {
//        	al.add(e)
//        }

        return set.size();
    }

}
