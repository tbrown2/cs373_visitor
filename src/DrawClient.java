/**
 * Created by Tom on 4/25/2016.
 */
public class DrawClient {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{new Square(1, 2), new Square(5, 6), new Circle(8), new Circle(10)};
        Draw drawer = new DrawImpl();
        for (Shape s: shapes){
            s.accept(drawer);
        }
    }
}
