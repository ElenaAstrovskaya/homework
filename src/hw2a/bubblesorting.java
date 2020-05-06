package hw2a;

public class bubblesorting {
    // Создать и заполнить массив случайными числами, отсортировать массив по возрастанию,
    // используя метод сортировки пузырьком.
    public static void main(String[] args)  {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.println(arr[i] + " ");
        }

        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println("Bubble sorting: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
