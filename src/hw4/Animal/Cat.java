package hw4.Animal;

public class Cat extends Feline {
    private String breed;

    public Cat(String breed) {
        this.breed = breed;
    }

    @Override
    public void info() {
        super.info();
        System.out.printf("Breed is a %s\n", breed);
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eatenBy() {
        super.eatenBy();
        System.out.println("Can be eaten by dog");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void speak() {
        super.speak();
    }
}
