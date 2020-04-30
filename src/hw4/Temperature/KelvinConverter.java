package hw4.Temperature;

public class KelvinConverter implements IConverter {

    @Override
    public double convert(double value) {
        System.out.println("Kelvin = " + (value + 273.15));
        return 0;
    }
}