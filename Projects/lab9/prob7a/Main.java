package lab9.prob7a;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		//your stream pipeline here
List<String> aba = list.stream().sorted(Comparator.comparing(Employee::getFirstName)).filter(x->x.getSalary()>100000)
		.filter(x->x.getLastName().charAt(0)>'M')
		.map(x->x.getFirstName()+" "+x.getLastName())
		.collect(Collectors.toList());
		System.out.println(aba);
//		Optional<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java").reduce((x,y)->x+" "+y);
//		System.out.println(strings.get());

	}



}
