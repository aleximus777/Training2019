import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] a1 = new int[rnd.nextInt(11) + 1];
        randomiseArray(a1);
        printArray(a1);
        int[] a2 = new int[rnd.nextInt(11) + 1];
        randomiseArray(a2);
        printArray(a2);
        int[] a3 = new int[a1.length + a2.length];
        int a1Index = 0;
        int a2Index = 0;

        for (int i = 0; i < a3.length; i++) {
            if (i % 2 == 0) {
                if (a1.length > a1Index) {
                    a3[i] = a1[a1Index++];
                } else
                    a3[i] = a2[a2Index++];
            } else {
                if (a2.length > a2Index) {
                    a3[i] = a2[a2Index++];
                } else
                    a3[i] = a1[a1Index++];
            }
        }
        printArray(a3);
    }

    public static void randomiseArray(int[] arg) {
        Random rnd = new Random();
        for (int i = 0; i < arg.length; i++) {
            arg[i] = rnd.nextInt(10);
        }
    }

    public static void printArray(int[] arg) {
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] + " ");
        }
        System.out.println();
    }
}
