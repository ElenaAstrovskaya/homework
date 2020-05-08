package hw4.Animal;

public class Rodents implements IAnimal{

    @Override
    public void info() {
        System.out.println("Family type is Rodents");
        System.out.println("Feed type is omnivores");
    }

    @Override
    public void move() {
        System.out.println("Can move");
    }

    @Override
    public void speak() {
        System.out.println("Spaeks \"Pi-pi-pi!\"");
    }

    @Override
    public void eatenBy() {
        System.out.println("Can be eaten by dog and cat");
    }

    @Override
    public void eat() {
        System.out.println("Can eat worms and plants");
    }
}
