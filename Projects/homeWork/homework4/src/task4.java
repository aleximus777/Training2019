import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] array2d = new int[2][rnd.nextInt(11) + 1];
        int[] array1d = new int[array2d[0].length + array2d[1].length];
        int acc = 0;

        for (int i = 0; i < array2d.length; i++) {
            System.out.print("Array " + (i + 1) + " : ");
            for (int c = 0; c < array2d[i].length; c++) {
                array2d[i][c] = rnd.nextInt(11) + 1;
                array1d[acc++] = array2d[i][c];
            }
            printArray(array2d[i]);
        }

        System.out.println("\nResult:");
        printArray(array1d);
    }

    public static void printArray(int[] arg) {
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] + " ");
        }
        System.out.println();
    }
}
