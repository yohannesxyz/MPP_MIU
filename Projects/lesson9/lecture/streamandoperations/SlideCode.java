package lesson9.lecture.streamandoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SlideCode {
	public static void main(String args[]){
		/*List<String> list = Arrays.asList("Red","Pink","Black","Blue","Brown");
		List<String> list1 = Arrays.asList("Java","Design Pattern","Data Structures");
		Stream<String> res1= Stream.concat(list.stream(), list1.stream());
		res1.forEach(System.out::println);

		
		Stream<String> res3= Stream.concat(list.stream()
				.filter(ele->ele.startsWith("B")), list1.stream());
				res3.forEach(System.out::println);*/
				
				//Stream<String> uniqueWords
		           Stream.of("merrily", "merrily", "merrily", "gently","java").distinct()
		           .sorted()
		          .forEach(System.out::println);


		           List<String> words = Arrays.asList("Tom", "Joseph", "Richard");
		           Stream<String> longestFirst 
		                       = words.stream().sorted((String x, String y) -> 
		           		          (new Integer(y.length()).compareTo(new Integer(x.length()))));
		                    System.out.println(longestFirst.collect(Collectors.toList()));

	/*// Sum of suqred odd number
		
		Stream<Integer> ints = Stream.of(1, 2, 3, 4, 5);
			int res = ints.filter(n -> n % 2 == 1)
			.map(n->n*n)
			.reduce(0, Integer::sum);
			System.out.println(res);
	
			// Count the words startwith 'B'
		long c = 	list.stream()
			.filter(x -> x.startsWith("B"))
			.count();
		System.out.println("Count : " + c);
		
		// Create random numbers using generate()
		Stream.generate(Math::random)
		.skip(3)
		.limit(5)
		.forEach(System.out::println);

		// Print numbers using Iterate
		
		// Creates a stream of natural numbers
		Stream<Long> naturalNumbers = Stream.iterate(1L, n -> n + 1);
				naturalNumbers.limit(10)
				.forEach(System.out::println);
		
		
		// Creates a stream of odd natural numbers
		Stream.iterate(1L, n -> n + 2)
		.skip(3)
		.limit(5)
		.forEach(System.out::println);*/

			
		}
	
	
}
