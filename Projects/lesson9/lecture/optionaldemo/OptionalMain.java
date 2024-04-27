package lesson9.lecture.optionaldemo;

import java.util.*;

public class OptionalMain {

    public String getCarInsuranceName(Optional<Person> person) {
        return person.flatMap(Person::getCar)
                     .flatMap(Car::getInsurance)
                     .map(Insurance::getName)
                     .orElse("Unknown"); // A default value if the resulting optional is empty
    }
}
