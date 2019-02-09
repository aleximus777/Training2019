import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Roman number: ");
        String roman = in.next();
        int answer;

        answer = convertToArab(roman);

        if (answer == -1) {
            System.out.println("Not Roman number!");
        } else
            System.out.println("Converted value = " + answer);
    }

    public static int convertToArab(String roman) {
        int lastVal = 0;
        int curVal = 0;
        int acc = 0;
        boolean error = false;

        for (int i = 0; i < roman.length(); i++) {
            switch (roman.toUpperCase().charAt(i)) {
                case 'M':
                    curVal = 1000;
                    break;
                case 'D':
                    curVal = 500;
                    break;
                case 'C':
                    curVal = 100;
                    break;
                case 'L':
                    curVal = 50;
                    break;
                case 'X':
                    curVal = 10;
                    break;
                case 'V':
                    curVal = 5;
                    break;
                case 'I':
                    curVal = 1;
                    break;
                default:
                    error = true;
            }
            if (error) {
                acc = -1;
                break;
            }
            if (lastVal < curVal) {
                acc = acc + (curVal - lastVal) - lastVal;
            } else
                acc = acc + curVal;
            lastVal = curVal;
        }
        return acc;
    }
}

