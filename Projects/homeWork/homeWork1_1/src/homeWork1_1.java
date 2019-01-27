import java.util.Scanner;

public class homeWork1_1 {
    public static void main(String[] args) {

        boolean valid = false;
        int day = 1;
        int month = 1;
        int year = 1;

        Scanner input = new Scanner(System.in);

        while (!valid) {
            System.out.print("Input Year: ");
            year = input.nextInt();
            System.out.print("Input Month: ");
            month = input.nextInt();
            System.out.print("Input Day: ");
            day = input.nextInt();

            valid = true;
            if (day < 1 || month < 1 || year < 1 || month > 12 || isDayNotValid(day, month, year)) {
                System.out.println("Illegal date, repeat input");
                valid = false;
            }

        }

        if (isDayNotValid(++day, month, year)) {
            day = 1;
            if (++month > 12) {
                month = 1;
                ++year;
            }
        }

        printDate(day, month, year);

    }

    public static void printDate (int day, int month, int year)
    {
        int yearMod = year;
        int divider = 1000;
        if (day < 10) {
            System.out.print("0");
        }
        System.out.print(day + ".");
        if (month <10) {
            System.out.print("0");
        }
        System.out.print(month + ".");
        while (yearMod / divider == 0) {
            System.out.print("0");
            divider /= 10;
        }
        System.out.print(year);
    }

    public static boolean isDayNotValid (int day, int month, int year){
                boolean result = false;
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if (day > 31) {
                            result = true;
                        }
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        if (day > 30) {
                            result = true;
                        }
                        break;
                    case 2:
                        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                            if (day > 29) {
                                result = true;
                            }

                        } else if (day > 28) {
                            result = true;
                        }


                }
                return result;
            }

        }
