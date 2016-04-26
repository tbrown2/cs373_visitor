/**
 * Created by Tom on 4/25/2016.
 */
public class DrawImpl implements Draw {
    @Override
    public Void onCircle(final Circle c) {
        System.out.println("Drawing a circle on a canvas with radius " + c.getRadius());
        return null;
    }
    @Override
    public Void onSquare(final Square s) {
        System.out.println("Drawing a sqaure with height " + s.getHeight() + " and width " + s.getWidth());
        return null;
    }
}
