package hw2a;

public class massiv {
    public static void main(String[] args) {
        // Создать зубчатый (рваный) двумерный массив,
        // заполненный случайными числами, вывести его элементы на экран.
        // Каждая строка зубчатого двумерного массива должны быть произвольной длины.
        // Длина строки должна выбираться случайно.
        // Использовать класс Random или Math.random()

        int[][] mas = new int[3][];
        mas[0] = new int[5];
        mas[1] = new int[2];
        mas[2] = new int[7];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
