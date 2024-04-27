package lab9Solved.prob7b;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final Function<List<Employee>,String> ABEBE = (emps)->{
       return emps.stream()
                .filter(e -> (e.getSalary() > 100000))
                .filter(e -> (e.getLastName().charAt(0) > 'M'))
                .map(e -> e.getFirstName()+" "+e.getLastName())
                .sorted()
                .collect(Collectors.joining(", "));
    };
}
