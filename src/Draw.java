/**
 * Created by Tom on 4/25/2016.
 */
public interface Draw<Result> {
    Result onCircle(Circle c);
    Result onSquare(Square s);
}
