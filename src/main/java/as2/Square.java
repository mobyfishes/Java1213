package as2;

public class Square extends Shape{

    public int side;

    public Square(int s){
        this.side = s;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        this.area = this.side ^ 2;
    }
}
