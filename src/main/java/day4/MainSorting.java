package day4;

import java.util.ArrayList;
import java.util.List;

public class MainSorting {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(0, "B", 200));
		employeeList.add(new Employee(1, "C", 200));
		employeeList.add(new Employee(2, "a", 200));
		employeeList.sort((o1,o2)-> o1.getName().compareToIgnoreCase(o2.getName()));
		employeeList.forEach(System.out::println);
	}

}
