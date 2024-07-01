package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListTest {

    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            arraylist.add((int) (Math.random() * 10));
            linkedlist.add((int) (Math.random() * 10));
        }

        //System.out.println(arraylist.get(2));
        //System.out.println(linkedlist.get(2));

        arraylist.stream().forEach(i -> System.out.print(i + " "));
        System.out.println();
        linkedlist.stream().forEach(i -> System.out.print(i + " "));
        System.out.println();

        /*
         * Queue<Integer> q=new LinkedList<>(linkedlist); System.out.println(q.peek());
         * q.poll();
         *
         * q.stream().forEach(i->System.out.print(i+" "));
         */


    }

}
