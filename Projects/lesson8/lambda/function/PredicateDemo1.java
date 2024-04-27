package java8featurepack.lambda.function;
import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<String> numbersOnly = (input) -> {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if ("0123456789".indexOf(c) == -1) {
                    return false;
                }
            }
            return true;
        };
        
        System.out.println(numbersOnly.test("12345"));// true
        System.out.println(numbersOnly.test("100a")); // false
            
    }
}







/* Predicate<String> i  = Predicate.isEqual("Renuka");
        System.out.println(i.test("Renuka"));*/