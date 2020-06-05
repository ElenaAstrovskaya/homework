package hw7;

import java.io.*;
import java.util.Scanner;

public class ReversInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String text = scanner.nextLine();

        StringBuffer str = new StringBuffer(text);

        try(FileOutputStream fos = new FileOutputStream("D://tmp//test3.txt");
            PrintStream ps = new PrintStream(fos))
        {
            ps.println(str.reverse());
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("All done! Please check the file");
    }
}