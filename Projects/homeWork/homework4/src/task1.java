import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize;
        int rst;
        Random rnd = new Random();

        System.out.print("Input array length: ");
        arraySize = input.nextInt();

        int[] workArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            workArray[i] = rnd.nextInt(100);
            System.out.print(workArray[i] + " ");
        }

        System.out.println("\n" + "Result:");

        rst = workArray[arraySize - 1];

        for (int i = arraySize - 1; i > 0; i--) {

            workArray[i] = workArray[i - 1];
        }
        workArray[0] = rst;

        for (int i = 0; i < arraySize; i++) {
            System.out.print(workArray[i] + " ");
        }
    }
}
