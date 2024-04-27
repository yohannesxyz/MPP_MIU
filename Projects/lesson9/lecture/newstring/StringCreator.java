package lesson9.lecture.newstring;
import java.util.function.*;
public class StringCreator {
	public static void main(String[] args) {
		
		char[] charArray = {'s','p','e','a','k','i','n','g','c','s'};
	 // Using method reference to create String object	
      Function<char[], String> myFunc = String::new; // take char[] array as input and return the string
      System.out.println(myFunc.apply(charArray));
      
      // Using lambdas to create String Object
      Function<char[], String> myFunc1 = charArr -> new String(charArray); 
      System.out.println(myFunc1.apply(charArray));
      
      // Usual Implementation of Converting CharArray to String object
       String s = new String(charArray);
       System.out.println(s);
	  
    }

}
