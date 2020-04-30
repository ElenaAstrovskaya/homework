package hw4.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Cat("Maine-coon"));
        animals.add(new Dog("Spaniel"));
        animals.add(new Mouse("Field mouse"));

        for (IAnimal animal : animals) {
            animal.info();
            animal.speak();
            animal.eatenBy();
            animal.eat();
            animal.move();
            System.out.println(" ");
        }
        System.out.println("All done!");
    }
}
