package hw7;

import java.io.*;

public class ReverseOutput {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D://tmp//test2.txt"))) {
            String str = br.readLine();
            String[] str1 = str.split(" ");

            int n = str1.length;
            String reverse;

            for (int i = 0; i < n/2; i++){
                reverse = str1[n - i - 1];
                str1[n - i - 1] = str1[i];
                str1[i] = reverse;
            }

            for (int i = 0; i < str1.length; i++){
                System.out.print(str1[i] + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}