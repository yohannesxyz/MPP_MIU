package lesson9.lecture.optionaldemo;

import java.util.*;

public class Person {

	// Person might or might not own a car, so declare as a Optional
    private Optional<Car> car; 

    public Optional<Car> getCar() {
        return car;
    }
}
