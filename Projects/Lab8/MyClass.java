package Lab8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyClass {
	int x;
	String y;

	public MyClass(int x, String y) {
		this.x = x;
		this.y = y;
	}

	// testing method to check the equality, write a lambda to do this
	public void myMethod(MyClass cl) {
		// Implement
		Predicate<MyClass> T = this::equals;
		System.out.println(T.test(cl));
		
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null)
			return false;
		if (ob.getClass() != getClass())
			return false;
		MyClass mc = (MyClass) ob;
		return mc.x == x && mc.y.equals(y);
	}

	public static void main(String[] args) {
		MyClass myclass = new MyClass(1, "A");
		MyClass myclass1 = new MyClass(1, "B");
		myclass.myMethod(myclass); // print true
		myclass.myMethod(myclass1); // print false
		String[] names = {"Alexis", "Tim", "Kyleen", "Kristy"};
		Comparator<String> comp= (x,y)->x.compareToIgnoreCase(y);
		Comparator<String> cop2 = String::compareToIgnoreCase;
		Arrays.sort(names,cop2);
//		Arrays.sort(names,String::compareToIgnoreCase); // we could also do this
		Function<String[],List<String>> lam = Arrays::asList;
		List<String> theList = lam.apply(names);
		Consumer<List<String>> cons= System.out::println;
		cons.accept(theList);
//	theList.forEach(cons);cons



	}
}