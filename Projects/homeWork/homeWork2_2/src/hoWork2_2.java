import java.util.Scanner;

public class hoWork2_2 {
    public static void main(String[] args) {
        int num;
        int value = 1;
        int prevValue = 0;
        int nxtValue = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        num = input.nextInt();

        while (value + prevValue < num) {
            nxtValue = prevValue + value;
            System.out.print(nxtValue + ", ");
            prevValue = value;
            value = nxtValue;
        }

    }
}
