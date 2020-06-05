package hw7;

import java.io.*;

public class Tasks1and2 {
    public static void main(String[] args) {

        System.out.println("Enter the way to the file (e.g. \"D:\\tmp\\test.txt\"): ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String nameOfFile = br.readLine();

            FileInputStream fis = new FileInputStream(nameOfFile);
            int max = fis.read();
            int min = fis.read();
            while (fis.available() > 0) {
                int b = fis.read();
                if (b > max)
                    max = b;
                if (b < min)
                    min = b;
            }
            System.out.println("Max byte in this file is " + max);
            System.out.println("Min byte in this file is " + min);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
