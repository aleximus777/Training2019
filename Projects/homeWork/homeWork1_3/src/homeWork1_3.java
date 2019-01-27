import java.util.Scanner;

public class homeWork1_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        double dsc;
        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("c = ");
        c = input.nextDouble();

        dsc = discriminant(a, b, c);
        System.out.println(dsc);

        if (!isPositive(dsc)) {
            System.out.println("Discriminant below zero");
        } else if (isZero(dsc)) {
            System.out.println("Discriminant is zero");
        }

        if (isPositive(dsc)) {
            System.out.println("X1 = " + ((-1) * b + Math.sqrt(dsc)) / (2 * a));
            System.out.println("X2 = " + ((-1) * b - Math.sqrt(dsc)) / (2 * a));
        }

    }

    public static double discriminant(double a, double b, double c) {
        double answer;
        answer = b * b - 4 * a * c;
        return answer;
    }

    public static boolean isPositive(double x) {
        boolean answer = false;
        if (x >= 0.0) {
            answer = true;
        }
        return answer;
    }

    public static boolean isZero(double x) {
        boolean answer = false;
        if (x == 0.0) {
            answer = true;
        }
        return answer;
    }

}
