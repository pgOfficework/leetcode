package practice;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapPractice {

    public static void main(String[] args) {
        Map<Integer,String> tmap=new TreeMap<>();

        tmap.put(2,"B");
        tmap.put(3,"C");
        tmap.put(26,"Z");
        tmap.put(1,"A");
        tmap.put(4,"D");

        System.out.println(tmap);
            // Create a TreeMap to store Person objects as keys and their ages as values
            TreeMap<Person, Integer> treeMap = new TreeMap<>();

            // Create Person objects
            Person person1 = new Person("Alice", 25);
            Person person2 = new Person("Bob", 30);
            Person person3 = new Person("Charlie", 20);

            // Insert Person objects into the TreeMap
            treeMap.put(person3, person3.getAge());
            treeMap.put(person1, person1.getAge());
            treeMap.put(person2, person2.getAge());

            // Iterate over the TreeMap
            for (Map.Entry<Person, Integer> entry : treeMap.entrySet()) {
                Person key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key.getName() + ": " + value);
            }

        TreeMap<Person1, Integer> treeMap1 = new TreeMap<>();

        Person1 person11 = new Person1("Alice", 25);
        Person1 person12 = new Person1("Bob", 30);
        Person1 person13 = new Person1("Charlie", 20);

        // Insert Person objects into the TreeMap
        treeMap1.put(person13, person13.getAge());
        treeMap1.put(person11, person11.getAge());
        treeMap1.put(person12, person12.getAge());

        // Iterate over the TreeMap
        for (Map.Entry<Person1, Integer> entry : treeMap1.entrySet()) {
            Person1 key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getName() + ": " + value);
        }
        }
}

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}

class Person1 implements Comparable<Person1> {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Person1 other) {
        return this.age;
    }
}
