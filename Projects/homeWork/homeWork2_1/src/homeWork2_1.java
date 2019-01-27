import java.util.Scanner;

public class homeWork2_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        int answer = 0;
        System.out.print("input = ");
        value = input.nextInt();

        while (value / 10 != 0) {
            answer += value % 10;
            value /= 10;
        }
        answer += value % 10;

        System.out.println("answer = " + answer);


    }
}
