package hw4.Animal;

public class Feline implements IAnimal{
    @Override
    public void eatenBy() {
    }

    @Override
    public void eat() {
        System.out.println("Can eat mouse");
    }

    @Override
    public void info() {
        System.out.println("Family type is Feline");
        System.out.println("Feed type is carnivores");
    }

    @Override
    public void move() {
        System.out.println("Can move");
    }

    @Override
    public void speak() {
        System.out.println("Speaks \"Meow!\"");
    }
}
