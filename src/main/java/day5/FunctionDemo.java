package day5;


import java.util.Optional;
import java.util.function.*;
import java.util.function.Supplier;

// functional interface
public class FunctionDemo {

    public static void main(String[] args){

        SayBye sb = () -> {
            System.out.println("Bye");
        };

        //sb.sayBye();
        //sb.sayHello();

        Supplier<Double> rdNumberGenerator = () -> Math.random();

        //System.out.println(rdNumberGenerator.get());

        Consumer<String> printer = (s) -> System.out.println(s);
        printer.accept("ACID");

        Predicate<Integer> checkNum = (i) -> (i > 10);
        Predicate<Double> checkDouble = (s) -> (s instanceof Double);

        String abc = "Excalibur";
        abc = null;
        Optional<String> checkString = Optional.ofNullable(abc);
        System.out.println(checkString.orElse("No NP"));

        if (checkNum.test(100)) printer.accept("Larger");
        if (checkNum.test(1)) printer.accept("Less");

        if (checkDouble.test(rdNumberGenerator.get())) printer.accept("Is Double Object");

    }

}

@FunctionalInterface // optional annotation
interface SayBye {
    void sayBye();

    default public void sayHello(){
        System.out.println("Hello");
    }

    default public void dayGM(){
        System.out.println("GM");
    }
}
