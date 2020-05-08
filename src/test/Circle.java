package test;

public class Circle extends Shape{
    static int Pi;
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void square() {
        System.out.println(Pi * radius);
        super.square();
    }

    @Override
    public void calculateSquare() throws ShapeIncorrectException {
        if (radius == 0){
            throw new ShapeIncorrectException("Parametres are incorrect");
        } else {
            System.out.println("Parametres are correct");
        }
        super.calculateSquare();
    }

}
