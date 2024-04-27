package lab9Solved.prob2;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.*;

//Lab-9 - Problem -2 Solution
public class Prob1C {
	public static void main(String[] args) {
		Stream<Integer> intStream = Arrays.asList(1,2,3).stream();
		IntSummaryStatistics summary
		   = intStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("max = " + summary.getMax() + " min = " + summary.getMin());
		
	}
}
