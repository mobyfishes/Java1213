import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestDemo {

    public static void main(String[] args){
         int a = 12131;

         String s1 = "123";
         StringBuilder s2 = new StringBuilder("123");
         StringBuffer s3 = new StringBuffer("123");

         concat1(s1);
         concat2(s3);
         concat3(s2);
//
//         System.out.println(s1);
//         System.out.println(s3);
//         System.out.println(s2);

        //System.out.println(Integer.parseInt("a"));

        Student st1 = new Student("alice",12,9438);
        Student st2 = new Student("Yasuo",41,4435);
        Student st3 = new Student("Saber",13,1223);
        Student st4 = new Student("Apex",21,2123);

        List<Student> ls = new ArrayList<Student>(Arrays.asList(new Student[]{st1, st2, st3, st4}));

        Collections.sort(ls, new studentComparetor());

        ls.stream().forEach(s->System.out.println(s.getName()));
       // System.out.println(frequencySort("tree"));

        Integer b = 12131;
        int c = 1123;
        int d = 1123;

        Consumer<String> printer = (i) -> System.out.println(i);
        Predicate<Integer> checker = (temp) -> (temp == b);


        if (c == d) printer.accept("c equals to d");
        if (checker.test(a)) printer.accept("a equals to b");

    }

    static class studentComparetor implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getAge() - o2.getAge();
        }
    }


    public static void concat1(String s){
        s = s + "TEST";
    }

    public static void concat2(StringBuffer s){
        s.append( "TEST");
    }

    public static void concat3(StringBuilder s){
        s.append( "TEST");
    }

    public static String frequencySort(String s){

        Map<Character, String> map = new HashMap();

        for (char c : s.toCharArray()){
            if (!map.containsKey(c)){
                map.put(c,String.valueOf(c));
            }
            else{
                String newString = map.get(c) + String.valueOf(c);
                map.put(c, newString);
            }
        }

        List<String> ans = new ArrayList<>(map.values());
        Collections.sort(ans, Comparator.comparingInt(String::length).reversed());


        StringBuffer result = new StringBuffer();
        ans.stream().forEach(i -> result.append(i));
        return result.toString();
    }
}
