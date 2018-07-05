package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainSorting {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(0, "B", 200));
		employeeList.add(new Employee(1, "C", 200));
		employeeList.add(new Employee(2, "a", 200));
		employeeList.add(new Employee(2, "BEE", 200));
		employeeList.sort((o1,o2)-> o1.getName().compareToIgnoreCase(o2.getName()));
//		employeeList.forEach(System.out::println);
		
		Stream<Employee> stream = employeeList.stream();
//		stream.forEach(System.out::println);
		List<String> result = stream.filter(object -> object.getName().startsWith("B"))
			.map(object -> object.getName().toLowerCase())
			.collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
