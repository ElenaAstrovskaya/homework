package hw2;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        //условные операторы
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("r = ");
        int r = scanner.nextInt();

        if (a < r * 2 & b < r * 2) {
            System.out.println("True");
        } else if (a >= r * 2 & b >= r * 2) {
            System.out.println("False");
        }


        //конструкция выбора switch
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = scanner1.nextInt();

        if (n > 10) {
            System.out.println("False");
        } else if (n <= 10) {
            switch (n) {
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thurday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;
                case 7:
                    System.out.print("Sunday");
                    break;
                default:
                    System.out.print("Not a week day");
            }
        }

        // циклы
        for(int i = 1; i < 5; i++) {
            System.out.println("****");
        }

        // массивы

        // В векторе, состоящем из n вещественных элементов, вычислить: сумму отрицательных элементов вектора
        // и произведение элементов вектора, расположенных между максимальным и минимальным элементами.

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter v = ");
        int v = scanner2.nextInt();

        int[] vector = new int[v];
        for(int i=0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * v)-v;
        }
        int max = vector[0];
        int min = vector[0];
        for(int i = 0; i < vector.length; i++) {
            int sum = 0;
            sum = sum + (vector[i] <0);
            if (min > vector[i])
                min = vector[i];
            if (max < vector[i])
                max = vector[i];
            else vector[i] *= vector[i];
            System.out.println(sum);
            System.out.println(max);
            System.out.println(min);
            System.out.println(vector[i] + " ");
        }


        // Создать и заполнить массив случайными числами, отсортировать массив по возрастанию,
        // используя метод сортировки пузырьком.
        int[] arr = new int[15];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random());
            if( arr[i] > arr[i+1] ) {
                int a = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = a;
                System.out.println(arr[i] + " ");
            }
        }

        // Создать двумерный массив, размером n x n (размер массива вводить с консоли).
        // Если элемент массива является четным числом, вывести 0, если не четным 1. Использовать циклы.

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter m = ");
        int m = scanner3.nextInt();

        int[][] nums2 = new int[m][m];
        for (int i = 0; i < nums2.length; i++) {
            i = (int) (Math.random() * m);
            for (int j = 0; j < nums2[i].length; j++) {
                j = (int) (Math.random() * m);
                if (nums2[i][j] % 2 == 0){
                    System.out.println(0);
                } else if (nums2[i][j] % 2 != 0){
                    System.out.println(1);
                }
            }
        }

        // Создать зубчатый (рваный) двумерный массив, заполненный случайными числами, вывести его элементы на экран.
        // Каждая строка зубчатого двумерного массива должны быть произвольной длины. Длина строки должна выбираться
        // случайно. Использовать класс Random или Math.random()

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter p = ");
        int p = scanner4.nextInt();
        int[][] Mas = new int[p][];
        for (int i = 0; i < Mas.length; i++) {
            i = (int) Math.random();
            for (int j = 0; j < Mas.length; j++) {
                j = (int) Math.random();
                System.out.println(Mas[i][j] + " ");
            }
        }
        // Дано натуральное число n>1. Используя рекурсию, необходимо проверить, является ли оно простым.
        // Программа должна вывести фразу «Is number <your number> simple - YES», если число простое и
        // «Is number <your number> simple - NO», если число составное. Для вывода информации используйте метод printf.
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("q = ");
        int q = scanner5.nextInt();

        if (q == 2 | q == 3){
            System.out.printf("Is number q = %d simple - YES", q);
        }
        else if (q % 2 == 0 | q % 3 == 0) {
            System.out.printf("Is number q = %d simple - NO", q);
        }
        else {
            System.out.printf("Is number q = %d simple - YES", q);
        }

    }

}

