package StreamDemo;

import com.mysql.cj.xdevapi.Collection;

import java.util.*;
import java.util.stream.Collectors;

public class StremDemo1 {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("asujdh");
        list.add("eva");
        list.add("you");
        List<String> result = upperCase(list);
        System.out.println(result.toString());

    }

    public static List<String> upperCase(List<String> list){
        return list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    }

    public static Double average(List<Integer> list_1){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(44);
        list.add(42);
        list.add(43);
        list.add(46);
        list.add(47);

        String result = getString(list);

        System.out.println(average(list));

        return list.stream().mapToDouble(i -> i).average().orElse(0D);
    }

    public static String getString(List<Integer> list){

        StringBuffer result = new StringBuffer();
        list.stream().forEach(i -> {
            if (i % 2 == 0){
                result.append("e" + String.valueOf(i) + ",");
            }
            else{
                result.append("o" + String.valueOf(i) + ",");
            }
        })  ;

        return result.toString().substring(0, result.length() - 1);
    }

    public List<String> search(List<Person> list_1){
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("abc", 12);
        Person p2 = new Person("xcasabc", 12);
        Person p3 = new Person("ab1", 12);
        Person p4 = new Person("awbc", 12);
        Person p5 = new Person("qtt", 12);
        Person p6 = new Person("azsw", 12);
        Person p7 = new Person("agg", 12);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);

        List<String> search = list.stream()
                .filter(p -> p.name.startsWith("a"))
                .filter(p -> p.name.length() == 3)
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println(search.toString());

        return  list_1.stream()
                .filter(p -> p.name.startsWith("a"))
                .filter(p -> p.name.length() == 3)
                .map(p -> p.name)
                .collect(Collectors.toList());
    }
}

