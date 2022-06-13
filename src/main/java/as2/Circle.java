package as2;

public class Circle extends Shape{

    public int radius;

    public Circle(int radius){
        this.radius = radius;
        calculateArea();
    }

    @Override
    public void calculateArea(){
        this.area = 3.1415926 * (radius * radius);
    }

}
