package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(4,2,5,7,9,7));

        List<Integer> result = list.stream().filter(e -> e>4).distinct().collect(Collectors.toList());

        System.out.println(result);
    }
}
