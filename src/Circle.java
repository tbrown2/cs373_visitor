/**
 * Created by Tom on 4/25/2016.
 */
public class Circle implements Shape{
    public int radius;

    public Circle(final int radius) {
        assert radius >= 0;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public <Result> Result accept(final Draw<Result> v) {
        return v.onCircle(this);
    }
}
