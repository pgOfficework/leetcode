package array;

import java.util.*;

public class RandomizedSet {
    HashSet<Integer> set;
    Random rndm;
    List<Integer> arr;

    public RandomizedSet() {
        set = new LinkedHashSet<>();
        rndm = new Random();
        arr = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (!set.contains(val)) {
            set.add(val);
            arr.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        int rndmNumber = rndm.nextInt(set.size());
        return arr.get(rndmNumber);
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();

        String[] input = {"RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"};
        int[] inputValue = {1, 2, 2, 1, 2};
        int i = 0;


        System.out.println(randomizedSet.set + "====" + randomizedSet.set.contains(3));

        for (String s : input) {
            switch (s) {
                case "RandomizedSet":
                    break;
                case "insert":
                    System.out.println(randomizedSet.insert(inputValue[i++]));
                    break;
                case "remove":
                    System.out.println(randomizedSet.remove(inputValue[i++]));
                    break;
                case "getRandom":
                    System.out.println(randomizedSet.getRandom());
                    break;
            }
        }
        System.out.println(randomizedSet.arr);
    }

}
