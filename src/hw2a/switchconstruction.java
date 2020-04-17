package hw2a;

import java.util.Scanner;

public class switchconstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = scanner.nextInt();

        if (n > 10) {
            System.out.println("False");
        } else if (n <= 10) {
            switch (n) {
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thurday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;
                case 7:
                    System.out.print("Sunday");
                    break;
                default:
                    System.out.print("Not a week day");
            }
        }
    }

}
