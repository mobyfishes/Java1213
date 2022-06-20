package day5;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args){

        String str = "123";

        if (str == null){
            System.out.println("String is null");
        }
        else{
            System.out.println("String is not null");
        }

        //Using optional
        Optional<String> opt = Optional.ofNullable(str);
        System.out.println(opt.orElse("Nothing Here"));

    }

}
