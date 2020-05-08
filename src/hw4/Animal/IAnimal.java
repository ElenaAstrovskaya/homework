package hw4.Animal;

public interface IAnimal {

    void info();

    void move();

    void speak();

    default void eatenBy(){};

    void eat();
}
