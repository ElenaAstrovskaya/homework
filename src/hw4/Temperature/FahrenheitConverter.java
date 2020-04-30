package hw4.Temperature;

public class FahrenheitConverter implements IConverter {

    @Override
    public double convert(double value) {
        System.out.println("Fahrenheit = " + value * 9 / 5 + 32);
        return 0;
    }
}