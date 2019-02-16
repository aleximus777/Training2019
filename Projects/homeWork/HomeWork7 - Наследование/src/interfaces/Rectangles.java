package interfaces;

public interface Rectangles {

    Double calculateSquare();

    class Utility {

        public static Double getSquare(double width, double height) {

            return width * height;
        }
    }
}
