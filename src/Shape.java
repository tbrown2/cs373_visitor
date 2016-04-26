/**
 * Created by Tom on 4/25/2016.
 */
public interface Shape {
    <Result> Result accept(Draw<Result> v);
}

