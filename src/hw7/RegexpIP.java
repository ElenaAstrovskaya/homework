package hw7;

import java.util.Scanner;

public class RegexpIP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the IP-address: ");
        String ip = scanner.nextLine();

        boolean res = ip.matches("(\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3})");

        if(res == true) {
            System.out.println("The entered value is IP-address");
        } else {
            System.out.println("The entered value is not IP-address");
        }
    }
}