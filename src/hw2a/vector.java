package hw2a;

public class vector {
    public static void main(String[] args) {
        // В векторе, состоящем из n вещественных элементов, вычислить:
        // сумму отрицательных элементов вектора и
        // произведение элементов вектора, расположенных между максимальным и минимальным элементами.
        int[] vector = {-3, -2, -1, 0, 1, 2, 3};
        int negativeSum = 0;
        int count = 1;

        for (int i = 0; i < 7; i++) {
            if (vector[i] < 0) {
                negativeSum = negativeSum + vector[i];
            }
            count = count * vector[i];
        }
        System.out.println("Negative sum is " + negativeSum);
        System.out.println("Count is " + count);
        System.out.println("All done");
    }
}
