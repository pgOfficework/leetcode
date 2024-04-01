package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("Java");

		ArrayList<Employee1> emp = new ArrayList<>();

		emp.add(new Employee1(100000, "A"));
		emp.add(new Employee1(200000, "B"));
		emp.add(new Employee1(300000, "C"));
		emp.add(new Employee1(400000, "D"));
		
		Function<Integer,Integer> fn=s->s+100;
		
		Consumer<Employee1> consumer=e->{
			e.salary=fn.apply(e.salary)+100;
		};
		
		for (Employee1 employee1 : emp) {
			consumer.accept(employee1);
		}
		
		for (Employee1 employee1 : emp) {
			System.out.println(employee1.salary);
		}

	}

}
