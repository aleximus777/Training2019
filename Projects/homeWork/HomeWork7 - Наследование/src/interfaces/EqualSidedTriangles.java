package interfaces;

public interface EqualSidedTriangles {

    Double calculateSquare();

    class Utility {

        public static Double getSquare(double size) {

            return size * size / 4 * Math.sqrt(3.0);
        }
    }
}
