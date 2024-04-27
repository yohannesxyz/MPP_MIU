// OptionalTest.java
package lesson9.lecture.streamandoperations;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalTest {
	public static void main(String[] args) {
		// Get the maximum of odd integers from the stream
		OptionalInt maxOdd = IntStream.of(10, 20, 30)
		                              .filter(n -> n % 2 == 1)
		                              .max();
		//System.out.println(maxOdd.getAsInt());
		if (maxOdd.isPresent()) {
			int value = maxOdd.getAsInt();
			System.out.println("Maximum odd integer is " + value);
		} 
		else {
			System.out.println("Stream is empty.");
		}

		// Get the minimum of Even integers from the stream
		OptionalInt numbers = IntStream.of(1, 10, 37, 20, 31)
		                               .filter(n -> n % 2 == 0)
		                               .min();
		if (numbers.isPresent()) {
			int value = numbers.getAsInt();
			System.out.println("Minimum Even integer is " + value);
		} 
		else {
			System.out.println("Stream is empty.");
		}

		// Get the longest name
		Optional<String> name = Stream.of("Ken", "Ellen", "Li")
			                      .max(Comparator.comparingInt(String::length));
		System.out.print("Longest Name : " + name.orElse(null));

			
		Optional<Person> person = Person.persons()
				.stream()
				.reduce((p1, p2) -> p1.getIncome() > p2.getIncome()?p1:p2);
		
		System.out.print("Highest Earner" + person.orElse(null));
		
		Optional< String > firstName = Optional.of( "Tom" ); 
		Optional< String > fullName = Optional.ofNullable( null );
		System.out.println( "\nFirst Name is set? " + firstName.isPresent() );
		System.out.println( "First Name: " + fullName.orElseGet( () -> "[none]" ) ); 
		System.out.println( firstName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) ); 
		System.out.println();

			
		}
}