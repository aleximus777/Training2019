import java.util.Scanner;

public class homeWork2_2 {

    public static void main(String[] args) {
        int num;
        int n = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        num = input.nextInt();

        while (fibonacci(n) < num) {
            System.out.print(fibonacci(n) + ", ");
            n++;
        }
    }

    public static int fibonacci(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        x = fibonacci(x - 2) + fibonacci(x - 1);
        return x;
    }
}
