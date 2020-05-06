package hw2a;

import java.util.Arrays;

public class vector {
    public static void main(String[] args) {
        int vector[] = {-3, -2, -1, 0, 1, 2, 3};
        int negativeSum = 0;
        int count = 1;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                negativeSum += vector[i];
            }

            Arrays.sort(vector);

            count = vector[1] * vector[2] * vector[3] * vector[4] * vector[5];
        }
        System.out.println("Negative sum is " + negativeSum);
        System.out.println("Min is " + vector[0]);
        System.out.println("Max is " + vector[6]);
        System.out.println("Count is " + count);
        System.out.println("All done");
    }
}