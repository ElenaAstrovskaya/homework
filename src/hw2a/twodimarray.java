package hw2a;

import java.util.Random;
import java.util.Scanner;

public class twodimarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = scanner.nextInt();

        Random rnd = new Random(System.nanoTime());
        int array[][] = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rnd.nextInt(100);
                System.out.print(array[i][j] + " ");
                if (array[i][j] % 2 == 0){
                    System.out.println(0);
                } else if (array[i][j] % 2 != 0){
                    System.out.println(1);
                }
            }
        }

    }
}
