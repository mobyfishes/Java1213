package as2;

public class Rectangle extends Shape{

    public int width;
    public int length;

    public Rectangle(int w, int l){
        this.width = w;
        this.length = l;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        this.area = this.width * this.length;
    }
}
