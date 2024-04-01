package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int salary;
	String name;

	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
}

public class MapTest {

	public static void main(String[] args) {
		String s1="pp";
		s1.intern();
		List<String> cars=Arrays.asList("Maruti","Honda","Pagani","BMW","Lamborghini","Wolkswagon");
		
		List<Employee> emp = Arrays.asList(
				new Employee(100000, "Aaaaaaaaaa"), 
				new Employee(200000, "Bbbbb"),
				new Employee(300000, "Ccccccccccc"), 
				new Employee(400000, "Ddddddddd"));

		List<Integer> numberList = Arrays.asList(10, 20, 25, 40, 50);
		
		//filter
		numberList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		
		emp.stream().filter(str->str.name.length()>8).forEach(n->System.out.println(n.name));
		
		emp.stream().filter(e->e.salary>200000).forEach(n->System.out.println(n.salary));
		
		//Map
		List<String> uppercaseCars=new ArrayList<String>();
		uppercaseCars=cars.stream().map(c->c.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercaseCars);
		
		emp.stream().filter(e->e.salary>200000).map(e->e.salary+123).forEach(System.out::println);
		
		emp.stream().map(e->e.salary+11).forEach(e->System.out.println(e));
		
		

	}

}
