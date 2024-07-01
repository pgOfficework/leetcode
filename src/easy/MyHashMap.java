package easy;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

    List<Integer> list = new ArrayList<>();

    public MyHashMap() {

    }

    public void put(int key, int value) {
        list.add(key, value + 1);
    }

    public int get(int key) {
        return list.get(key) - 1;
    }

    public void remove(int key) {
        list.add(key, 0);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */