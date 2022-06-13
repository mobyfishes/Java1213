package as2;

import java.util.*;


public class Assignment3 {

    public static void main(String[] args){
        Shape cricle = new Circle(4); // area: 50.2654816
        Shape rectangle = new Rectangle(3, 5);// area 15
        Shape rectangle2 = new Rectangle(10, 15);
        Shape square = new Square(5); //area 7

        if(cricle.compareTo(rectangle) > 0){
            System.out.println("Circle's area is larger than retangle");
        }

        List<Shape> list = new ArrayList<>();
        list.add(rectangle);
        list.add(cricle);
        list.add(square);
        list.add(rectangle2);

        for (Shape a: list){
            System.out.println(a.getArea());
        }

        System.out.println("\n");
        Collections.sort(list); // using compareTo

        for (Shape a: list){
            System.out.println(a.getArea());
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0)
                continue;

            System.out.println(i);
        }
    }

}
