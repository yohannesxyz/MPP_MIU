package lesson8InclassExercise;

import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String [] args){
        Function<Double,Double> miletoKm =(x)->x*1.6;
        System.out.println(miletoKm.apply(3.0));

        IntPredicate la = x->x%2==2;
        System.out.println(la.test(4));
        Supplier<Integer> ib= ()-> RandomGenerator.getDefault().nextInt();
        System.out.println(ib.get());
    }

}
