public class task2 {
    public static void main(String[] args) {


        int[] workArray = {1, 4, 5, 2, 7, 9, 1, 5, 6, 8, 3, 1};
        int flag;
        printArray(workArray);

        for (int i = 0; i < workArray.length; i++) {
            flag = 0;
            for (int c = 0; c < workArray.length; c++) {
                if (workArray[i] == workArray[c] && i != c) {
                    flag = 1;
                }
            }

            if (flag == 1) {
                flag = workArray[i];
                for (int c = 0; c < workArray.length; c++) {
                    if (workArray[c] == flag) {
                        workArray[c] = 0;
                    }
                }
            }
        }

        System.out.println("\n" + "Result:");

        printArray(workArray);
    }

    public static void printArray(int[] arg) {
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] + " ");
        }
    }
}
