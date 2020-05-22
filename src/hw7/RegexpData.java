package hw7;

import java.util.Scanner;

public class RegexpData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date and time: ");
        String date = scanner.nextLine();

        boolean res = date.matches("(\\d{4}/\\d{2}/\\d{2}\\s\\d{2}:\\d{2}:\\d{2})");

        if(res == true) {
            System.out.println("The data and time are in the correct format");
        } else {
            System.out.println("The data and time are not in the correct format");
        }
    }
}