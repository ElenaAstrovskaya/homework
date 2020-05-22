package hw7;

import java.util.Scanner;

public class RegexpHttpHttps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the domain-address (e.g. \"http://6.pogoda.by/\" or \"https://www.wildberries.by/\"): ");
        String domain = scanner.next();

        boolean res = domain.matches("http://((\\D*.|\\d*.)(\\D*.|\\d*).\\D{2,3})/||https://((\\D*.|\\d*.)(\\D*|\\d*).\\D{2,3}/)");
        if(res == true) {
            System.out.println("The domain name is correct");
        } else {
            System.out.println("The domain name is incorrect");
        }
    }
}