import java.util.Scanner;

public class homeWork1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, e, f;
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        System.out.print("c = ");
        c = input.nextInt();
        System.out.print("d = ");
        d = input.nextInt();
        System.out.print("e = ");
        e = input.nextInt();
        System.out.print("f = ");
        f = input.nextInt();


        if (isPossible(e - a, f, c, d) || isPossible(e, f - b, c, d)) {
            System.out.println("It's possible");
        } else {
            System.out.println("It's not possible");
        }


    }

    public static boolean isPossible(int p1, int p2, int p3, int p4) {
        boolean answer;
        answer = false;

        if ((p1 - p3 >= 0 && p2 - p4 >= 0) || (p1 - p4 >= 0 && p2 - p3 >= 0)) {
            answer = true;
        }

        return answer;
    }
}
