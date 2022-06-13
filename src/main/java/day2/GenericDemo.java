package day2;

public class GenericDemo {

    public static void main(String[] args){
        //case 1 key int val string
        Node1 n1 = new Node1(1, "abs");

        //case 2 key string value char
        Node2 n2 = new Node2("asd", 'a');

        //-----with generics------
        Node<Integer, String> node1 = new Node<>(1, "abs");
        Node<String, String> node2 = new Node<>("123ws", "abs");

    }

    public static <E> E getFirstElement(E[] arr){
        return arr[0];
    }

}


class Node<K, V>{
    K key;
    V value;

    public Node(K key, V value){
        this.key = key;
        this.value = value;
    }
}


class Node1{
    Integer key;
    String value;

    public Node1(Integer key, String value){
        this.value = value;
        this.key = key;
    }
}

class Node2{
    String key;
    char value;

    public Node2(String key, char value){
        this.value = value;
        this.key = key;
    }
}