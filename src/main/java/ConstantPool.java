public class ConstantPool {
    public static void main(String[] args){
        Integer a = 10;
        Integer b = 10;
        Integer d = new Integer(10);
        Integer e = new Integer(10);
        Integer f = Integer.valueOf(10);

        System.out.println(a == b); // true
        System.out.println(a == d); // false
        System.out.println(e == d); // false
        System.out.println(a == f); // true
        System.out.println(d == f); // false
    }

}
