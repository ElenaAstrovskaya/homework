package hw4.Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature Celsius value: ");
        double value = scanner.nextDouble();

        new CelsiusConverter().convert(value);
        new FahrenheitConverter().convert(value);
        new KelvinConverter().convert(value);

        System.out.println("All done!");
    }
}