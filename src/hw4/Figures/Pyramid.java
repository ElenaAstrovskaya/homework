package hw4.Figures;

public class Pyramid extends Shape {
    private double height;
    public double squareOfBase;

    public Pyramid(double volume, double height, double squareOfBase) {
        super(volume);
        this.height = height;
        this.squareOfBase = squareOfBase;
    }

    public double getHeight() {
        return height;
    }
}
