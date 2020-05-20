package hw6.CarShowroom;

public class Car {
    String model;
    int year;
    String type;
    double engineVolume;

    public Car(String model, int year, String type, double engineVolume) {
        this.model = model;
        this.year = year;
        this.type = type;
        this.engineVolume = engineVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car " +
                "model = '" + model + '\'' +
                ", year = " + year +
                ", type = '" + type + '\'' +
                ", engineVolume = " + engineVolume;
    }
}