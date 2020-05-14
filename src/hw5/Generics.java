package hw5;

import java.util.Scanner;

public class Generics<T> {

    private T[] type;

    public void setType(T[] type) {
        this.type = type;
    }

    public T index(int i) {
        return type[i];
    }

    public static void main(String[] args) {

        Generics<Integer> integ = new Generics<>();
        integ.setType(new Integer[] {123, 234, 345, 456, 567, 678});

        Generics<Long> lon = new Generics<>();
        lon.setType(new Long[] {123456L, 234567L, 345678L, 456789L, 567890L, 678901L});

        Generics<Double> doubl = new Generics<>();
        doubl.setType(new Double[] {1.2, 2.3, 3.4, 4.5, 5.6, 6.7});

        Generics<String> str = new Generics<>();
        str.setType(new String[] {"abc", "def", "ghi", "jkl", "mno", "qrs"});

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element's index = ");
        int i = scanner.nextInt();

        if (i < integ.type.length || i < lon.type.length || i < doubl.type.length || i < str.type.length ) {
            System.out.println("Integer value = " + lon.index(i) + "\n" +
                    "Long value = " + integ.index(i) + "\n" +
                    "Double value = " + doubl.index(i) + "\n" +
                    "String value = " + str.index(i));
        } else {
            System.out.println("There is no such index in the arrays");

        }
    }
}