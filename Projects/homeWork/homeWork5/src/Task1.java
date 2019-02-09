import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input word for check: ");
        String Word = in.next();

        System.out.println("Answer: " + isPalindrome(Word));

    }

    public static boolean isPalindrome(String arg) {
        String mirror = "";
        for (int i = 0; i < arg.length(); i++) {
            mirror = mirror + arg.charAt(arg.length() - 1 - i);
        }
        System.out.println("Mirror : " + mirror);
        return arg.contentEquals(mirror);
    }
}
