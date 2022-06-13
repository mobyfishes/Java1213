package day2;

import java.awt.*;
import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class EqualsHashCodeDemo {

    public static void main(String[] args){
        EHNode node1 = new EHNode(1);
        EHNode node2 = new EHNode(1);
        EHNode node3 = node2;
        //System.out.println(node3 == node2); //false
        //System.out.println(node1.equals(node2)); //false  Object.equals() -> ==

        Set<EHNode> ts212 = new TreeSet<>(
                new Comparator<EHNode>() {
                    @Override
                    public int compare(EHNode o1, EHNode o2) {
                        return o2.value - o1.value;
                    }
                }
        );


        Set<EHNode> ts = new TreeSet<>(
                new myComparator()
        );

        //with lambda
        Set<EHNode> ts2 = new TreeSet<>( (EHNode no1, EHNode no2) -> no1.value -no2.value );
        Set<EHNode> ts3 = new TreeSet<>( (no5, no6) -> {
            return no5.value -no6.value;
        } );

        ts.add(new EHNode(1));
        ts.add(new EHNode(2));
        ts.add(new EHNode(3));
        doSomething(node1);

        System.out.println(node1.value);

    }

    public static void doSomething(final EHNode node){
        node.value = 1123;
        node.setColor(Color.blue);
    }

}

abstract class testAbtractClass {
    public void fun(){
        int a = 0;
        int y = 1;

        int x = a / y;
    }

    public void fun2(){}
}


class myComparator implements Comparator<EHNode> {


    @Override
    public int compare(EHNode o1, EHNode o2) {
        return o1.value - o2.value;
    }
}

class EHNode implements Comparable<EHNode>{
    int value;
    Color color = new Color(123);
    public EHNode(int val){
        this.value = val;
    }

    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (!(o instanceof EHNode)) return false;
        EHNode tamp = (EHNode) o;
        return (tamp.value == this.value);

    }

    @Override
    public int hashCode(){
        return Objects.hash(value);
    }

    @Override
    public int compareTo(EHNode o){
        return this.value - o.value;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
