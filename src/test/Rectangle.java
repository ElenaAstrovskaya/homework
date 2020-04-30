package test;

public class Rectangle extends Shape{
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void square() {
        System.out.println(a * b);
        super.square();
    }

    @Override
    public void calculateSquare() throws ShapeIncorrectException {
        if (a == 0 || b == 0){
            throw new ShapeIncorrectException("Parametres are incorrect");
        } else {
            System.out.println("Parametres are correct");
        }
        super.calculateSquare();
    }
}
