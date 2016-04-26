/**
 * Created by Tom on 4/25/2016.
 */
public class Square implements Shape{
    int width;
    int height;

    public Square(final int width, final int height) {
        assert width >= 0;
        assert height >= 0;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public <Result> Result accept(final Draw<Result> v) {
        return v.onSquare(this);
    }

}
