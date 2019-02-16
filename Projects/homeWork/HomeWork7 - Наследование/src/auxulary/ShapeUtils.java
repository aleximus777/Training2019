package auxulary;

public class ShapeUtils {

    public static boolean isFigureTriangle(figures.Figure figure) {
        return figure.getType().equals("Triangle");
    }

    public static boolean isFigureRectangle(figures.Figure figure) {
        return figure.getType().equals("Rectangle");
    }
}
