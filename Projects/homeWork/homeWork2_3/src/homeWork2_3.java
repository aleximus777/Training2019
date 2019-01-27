import java.util.Scanner;

public class homeWork2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of days: ");
        int days = input.nextInt();
        int curPrecip = 0;
        int sumPrecip=0, maxPrecip=-1;

        for (int i=1;days >= i; i++) {
            System.out.print("Precipations on day " + i + ": ");
            curPrecip = input.nextInt();
            if (curPrecip > maxPrecip) maxPrecip = curPrecip;
            sumPrecip += curPrecip;
        }

        System.out.println("Days: " + days);
        System.out.println("Summary Precipations: " + sumPrecip);
        System.out.println("Average Integer Precipations:  " + sumPrecip/days);
        System.out.println("Max Precipations: " + maxPrecip);
    }
}
