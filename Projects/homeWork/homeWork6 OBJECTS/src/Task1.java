import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Point p1 = createPoint(1);
        Point p2 = createPoint(2);
        Rectangle rect = new Rectangle(p1, p2);

        System.out.println("Rectangular Diagonal: " + rect.getDiag());
        System.out.println("Rectangular Square: " + rect.getSquare());
    }

    public static Point createPoint(int num) {
        Scanner in = new Scanner(System.in);
        double[] coords = new double[2];
        System.out.print("Input Point #" + num + " X : ");
        coords[0] = in.nextDouble();
        System.out.print("Input Point #" + num + " Y : ");
        coords[1] = in.nextDouble();
        Point p = new Point(coords[0], coords[1]);
        return p;
    }
}
