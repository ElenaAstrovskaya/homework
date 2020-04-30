package hw4.Temperature;

public class CelsiusConverter implements IConverter {

    @Override
    public double convert(double value) {
        System.out.println("Celsius = " + value);
        return 0;
    }
}