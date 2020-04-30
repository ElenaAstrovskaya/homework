package hw4.Animal;

public class Сanine implements IAnimal{
    @Override
    public void info() {
        System.out.println("Family type is Canine");
        System.out.println("Feed type is carnivores");
    }

    @Override
    public void move() {
        System.out.println("Can move");
    }

    @Override
    public void speak() {
        System.out.println("Speaks \"Gav!\"");
    }

    @Override
    public void eatenBy() {
    }

    @Override
    public void eat() {
        System.out.println("Can eat cat or mouse");
    }
}
