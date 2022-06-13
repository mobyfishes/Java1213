package as2;

abstract class Shape implements Comparable<Shape>{

    public double area;

    public abstract void calculateArea();

    public int compareTo(Shape o){
        return (int)(this.area - o.area);
    }

    public double getArea(){
        return this.area;
    }

    @Override
    public boolean equals(Object o){
        if (o == null) return false;
        if (!(o instanceof Shape)) return false;
        Shape tamp = (Shape) o;
        return (tamp.area == this.area);
    }
}
