package hw4.Figures;

public class Main {
    public static void main(String[] args) {

        Ball ball = new Ball(6.3, 3.5);
        Celinder celinder = new Celinder(10.5, 3.7, 6.2);
        Pyramid pyramid = new Pyramid(7.5, 5.1, 3.9);
        Box box = new Box(20.0);

        box.add(ball);
        box.add(celinder);
        box.add(pyramid);
    }
}