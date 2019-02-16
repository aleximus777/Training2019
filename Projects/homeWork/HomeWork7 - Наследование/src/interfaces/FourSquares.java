package interfaces;

public interface FourSquares {

    Double calculateSquare();

    class Utility {

        public static Double getSquare(double size) {
            return size * size;
        }
    }
}
