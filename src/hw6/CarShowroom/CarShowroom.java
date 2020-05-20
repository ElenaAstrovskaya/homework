package hw6.CarShowroom;

import java.util.ArrayList;
import java.util.Scanner;

public class CarShowroom {

    Scanner scanner = new Scanner(System.in);

    void addCar(ArrayList<Car> position) {
        System.out.print("Enter the car model: ");
        String model = scanner.next();
        System.out.print("Enter the year car of building: ");
        int year = scanner.nextInt();
        System.out.print("Enter the car body type: ");
        String type = scanner.next();
        System.out.print("Enter the car engine volume: ");
        double engineVolume = scanner.nextDouble();

        position.add(new Car(model, year, type, engineVolume));
        System.out.println("The car " + model + " is added");
    }

    void getInfo(ArrayList<Car> position) {
        System.out.print("Enter a car model: ");
        String mod = scanner.next();

        if (mod.equals("Mercedes") || mod.equals("Lada") || mod.equals("BMW")) {
            System.out.println("Information about " + mod + ": ");
            for (Car c : position) {
                if (c.getModel().equals(mod)) {
                    System.out.print(c.getYear() + ", ");
                    System.out.print(c.getType() + ", ");
                    System.out.print(c.getEngineVolume() + "\n");
                }
            }
        } else {
            System.out.println("There is no such car model in our showroom" + "\n");
        }
    }

    void buyCar(ArrayList<Car> position) {
        System.out.print("Enter the car model: ");
        String c = scanner.next();
        if (c.equals("Mercedes") || c.equals("Lada") || c.equals("BMW")) {
            System.out.printf("%s is yours! Congratulations!\n", c);
        } else {
            System.out.printf("The showroom doesn't have %s", c + "\n");
        }
    }

    void getList(ArrayList<Car> position) {
        for (Car car : position) {
            System.out.println(car);
        }
    }
}