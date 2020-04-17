package hw2a;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("r = ");
        int r = scanner.nextInt();

        if(a<r *2 & b < r *2)

        {
            System.out.println("The rectangular hole is closed by round cardboard");
        } else if(a >= r *2 | b >=r *2) {
            System.out.println("The rectangular hole is not closed by round cardboard");
        }

    }
}
