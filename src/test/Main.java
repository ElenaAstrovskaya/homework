package test;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(5, 7);
        Rectangle rectangle = new Rectangle(4, 0);

        try {
            circle.calculateSquare();
        } catch (ShapeIncorrectException e) {
            e.printStackTrace();
        }
        try {
            triangle.calculateSquare();
        } catch (ShapeIncorrectException e) {
            e.printStackTrace();
        }
        try {
            rectangle.calculateSquare();
        } catch (ShapeIncorrectException e) {
            e.printStackTrace();
        }
    }
}
