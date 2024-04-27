package lesson9.lecture.streamreuse;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Shows how streams cannot be reused
public class CantReuse {
	private Stream<String> stream 
	   = Folks.friends.stream().filter(name -> name.startsWith("N"));
	public static void main(String[] args) {
		CantReuse cr = new CantReuse();
		//int numFriendsStartWithN = (int)cr.stream.count();
		//System.out.println("Count = " + numFriendsStartWithN );
		//this leads to IllegalStateException because already terminal operation done with stream(count())
		List<String> nameListStartWithN = cr.stream.collect(Collectors.toList());
		System.out.println(nameListStartWithN);
	}
}
