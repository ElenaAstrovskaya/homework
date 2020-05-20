package hw6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Plants {
    public static void main(String[] args) {

        Map<String, String> plant = new HashMap<>();
        plant.put("Watermelon", "Berry");
        plant.put("Tomato", "Vegetable");
        plant.put("Cucumber", "Vegetable");
        plant.put("Apple", "Fruit");
        plant.put("Peach", "Fruit");
        plant.put("Maple", "Tree");
        plant.put("Rose", "Flower");
        plant.put("Wheat", "Cereal");

        for (Map.Entry<String, String> pl : plant.entrySet()) {
            System.out.printf("Type of plant: %s Example: %s\n", pl.getKey(), pl.getValue());
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a plant: ");
        String p = scanner.nextLine();

        System.out.printf("The type of a/an %s", p + " is " + plant.get(p));
    }
}