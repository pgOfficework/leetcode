package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("car", "car", "bike", "bus", "bus", "bus");
		
		//distinct
		list.stream().distinct().forEach(System.out::println);
		
		//count
		System.out.println(list.stream().distinct().count());
		
		//count
		list.stream().limit(2).forEach(System.out::println);
		
		Map<Object, Long> c=list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		System.out.println(c);
	}

}
