package lesson9.lecture.streamandoperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;

public class TestSlideCodeStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList();
		list.add("Red");
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		list.add("Brown");
		System.out.println("Empty Stream : ");
		Stream<String> s = Stream.empty();
	    s.limit(10)
	     .forEach(System.out::println); 
		List<String> startsWithLetter =  list.stream()    //create the stream
		           .filter(name -> name.startsWith("B"))  //build pipeline
		           .collect(Collectors.toList());            //invoke terminal operation

		Stream<String> startsWithLetter1 =  list.stream()    //create the stream
		           .filter(name -> name.startsWith("B"));  //build pipeline
		           //.collect(Collectors.toList());            //invoke terminal operation
		// All intermedaite operations return stream, only the terminal operation return the specified type
		System.out.println(startsWithLetter1.collect(Collectors.toList()));
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		 int tot = numbers.stream() //create the stream
		.filter(n -> n % 2 == 1)  // intermediate operation 
		.map(n -> n * n) // intermediate operation 
		.reduce(0, Integer::sum); // terminal operation

		 System.out.println(tot);
		
		 // Ways to create a Stream
		 
		// Method 1
		 int sum = Stream.of(1, 2, 3, 4, 5)
					.filter(n -> n % 2 == 1)
					.map(n -> n * n)
					.reduce(0, Integer::sum);
					System.out.println("Sum = " + sum);

	    // Method 2
		IntStream oneToFive = IntStream.range(1, 6);
		oneToFive.forEach(ele-> System.out.println(ele));
		IntStream oneToFive1 = IntStream.rangeClosed(1, 5);
		oneToFive1.forEach(System.out::println);
		
		// Method 3
		
		System.out.println("Empty Stream : ");
		IntStream number = IntStream.empty();
		number.forEach(System.out::println);
		
		// Method 4 Infinite Streams
		
		Stream.generate(Math::random)
		.limit(5)
		.forEach(System.out::println);
		
		Stream.iterate(1L, n -> n + 2)
		//.skip(5)
		.limit(5)
		.forEach(System.out::println);
		
		Stream.generate(()->"Echo")
		.limit(5)
		.forEach(System.out::println);
		
		// Method 5
		Stream<String> names = Arrays.stream(new String[] {"Ken", "Jeff"});
		names.forEach(System.out::println);
		
		// Stream Operations
		List<String> words = list;
	    final long count = words.stream().filter(w -> w.length() > 3)  
	    			    		   .count(); 
	    System.out.println("Count : " + count);

		
	    // Stream Concatenation
	    
	    Stream<Double> s1 = Stream.generate(Math::random)
	    		.limit(5);
	    
	    Stream<Double> s2 = Stream.generate(Math::random)
	    		.limit(5);
	    
	    Stream<Double> s3 = Stream.concat(s1, s2);
	    s3.forEach(System.out::println);
	    
	    // Map & flatMap
	    
	    List<String> lt = Arrays.asList("Joe", "Tom", "Abe");
		//Stream<Stream<Character>> result = lt.stream().map(s -> characterStream(s));
	 //   Stream<Stream<Character>> result = list.stream().map(s -> characterStream(s));

	//	Stream<List<Character>> res2 = result.map(x -> x.collect(Collectors.toList()));
	//	res2.forEach(s -> System.out.println(s));
		

	    
		/*Stream<Character> flatResult = lt.stream().flatMap(s -> characterStream(s));

		List<Character> res = lt.stream().flatMap(s -> characterStream(s))
		.collect(Collectors.toList());
	    
		System.out.println(res);*/
		
	//	List<Stream<Character>> res1 = lt.stream().map(s -> characterStream(s))
	//			.collect(Collectors.toList());
			    
	//			System.out.println(res1);
				
				//List<String> listOfStream = streamOfString.collect(Collectors.toList());

				// Stateful Transformations
				Stream<String> uniqueWords
		          = Stream.of("merrily", "merrily", "merrily", "gently").distinct();
				System.out.println("Unique Words");
				System.out.println(uniqueWords.collect(Collectors.toList()));

				
				List<String> word = Arrays.asList("Tom", "Joseph", "Richard");
				
				// Sorting by length
				Stream<String> longestFirst 
				            = word.stream().sorted((x, y) -> 
						          (new Integer(y.length()).compareTo(new Integer(x.length()))));
				         System.out.println(longestFirst.collect(Collectors.toList()));
				        // words.stream().sorted(Comparator.comparing(String::length).reversed());

				// Sorting - Lower to Higher
				         word.stream()
				         .sorted()
				         .forEach(System.out::println);
				        	}
	public static Stream<Character> characterStream(String s) {
		List<Character> result = new ArrayList<>();
		for (char c : s.toCharArray()) result.add(c);
		return result.stream();
		
		}
}
