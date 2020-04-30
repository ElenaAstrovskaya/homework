package hw4.Figures;

public class Main {
    public static void main(String[] args) {

        Ball ball = new Ball(6, 3);
        Celinder celinder = new Celinder(10, 3, 6);
        Pyramid pyramid = new Pyramid(7, 5, 3);
        Box box = new Box(100);

        box.add(ball);
        box.add(celinder);
        box.add(pyramid);
    }
}