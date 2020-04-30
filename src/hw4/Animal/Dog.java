package hw4.Animal;

public class Dog extends Сanine {
    private String breed;

    public Dog(String breed) {
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
    public void speak() {
        super.speak();
    }

    @Override
    public void eatenBy() {
        super.eatenBy();
    }

    @Override
    public void eat() {
        super.eat();
    }
}
