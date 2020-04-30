package hw4.Figures;

import java.util.ArrayList;
import java.util.List;

public class Box extends Shape {
    public Box(double volume) {
        super(volume);
    }

    List<Shape> shapes = new ArrayList<>();

    public double volumeBox = 20;

    public boolean add(Shape shape){
        if (volumeBox >= shape.getVolume()) {
            shapes.add(shape);
            volumeBox -= shape.getVolume();
            System.out.println("A new shape is added");
            return true;
        }else{
            System.out.println("It is impossible to add a new shape");
            return false;
        }
    }
}