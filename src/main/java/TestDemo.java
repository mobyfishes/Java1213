public class TestDemo {

    public static void main(String[] args){
         int a = 1;

         String s1 = "123";
         StringBuilder s2 = new StringBuilder("123");
         StringBuffer s3 = new StringBuffer("123");

         concat1(s1);
         concat2(s3);
         concat3(s2);

         System.out.println(s1);
         System.out.println(s3);
         System.out.println(s2);

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
}
