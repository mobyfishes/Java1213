package day2;

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

        Set<EHNode> ts = new TreeSet<>(
                new myComparator()
        );
        ts.add(new EHNode(1));
        ts.add(new EHNode(2));
        ts.add(new EHNode(3));
        System.out.println(ts.size());

    }

}

class myComparator implements Comparator<EHNode> {
    @Override
    public int compare(EHNode o1, EHNode o2) {
        return o1.value - o2.value;
    }
}

class EHNode implements Comparable<EHNode>{
    int value;

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
}
