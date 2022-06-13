public class LambdaDemo {

    public static void main(String[] args){
        // method in Object
        Draw a = new Draw();
        a.draw();

        // method with lambda
        // Drawable d = (int i) for parameters
        Drawable d = () ->{
            System.out.println("Draw a lambda");
        };

        d.draw();
    }

}

interface Drawable {
    public void draw();
}

class Draw implements Drawable{

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}
