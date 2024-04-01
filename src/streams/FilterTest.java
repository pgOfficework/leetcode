package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee1 {
	int salary;
	String name;

	public Employee1(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
}

public class FilterTest {

	public static void main(String[] args) {
		List<Employee1> emp = Arrays.asList(
				new Employee1(100000, "Aaaaaaaaaa"), 
				new Employee1(200000, "Bbbbb"),
				new Employee1(300000, "Ccccccccccc"), 
				new Employee1(400000, "Ddddddddd"));

		List<Integer> numberList = Arrays.asList(10, 20, 25, 40, 50);
		
		//filter
		numberList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		emp.stream().filter(str->str.name.length()>8).forEach(n->System.out.println(n.name));
		
		emp.stream().filter(e->e.salary>200000).forEach(n->System.out.println(n.salary));

	}

}
