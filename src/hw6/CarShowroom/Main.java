package hw6.CarShowroom;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> position = new ArrayList<>();
        position.add(new Car("Mercedes", 2020, "Sedan", 1.8));
        position.add(new Car("Lada", 2019, "Universal", 1.6));
        position.add(new Car("BMW", 2020, "Hatchback", 1.8));

        CarShowroom carShowroom = new CarShowroom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of operation you wish:\n " +
                "1. Add a car\n " +
                "2. Get information about a car\n " +
                "3. Buy a car \n " +
                "4. Get a list of all the cars\n" +
                "Your choice: ");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                carShowroom.addCar(position);
                break;
            case 2:
                carShowroom.getInfo(position);
                break;
            case 3:
                carShowroom.buyCar(position);
                break;
            case 4:
                carShowroom.getList(position);
                break;
        }
    }
}