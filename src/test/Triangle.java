package test;

public class Triangle extends Shape{
    int height;
    int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public void square() {
        System.out.println(base / 2 * base);
        super.square();
    }

    @Override
    public void calculateSquare() throws ShapeIncorrectException {
        if (height == 0 || base == 0){
            throw new ShapeIncorrectException("Parametres are incorrect");
        } else {
            System.out.println("Parametres are correct");
        }
        super.calculateSquare();
    }
}
