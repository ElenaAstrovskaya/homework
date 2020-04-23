package hw3;

import java.util.Scanner;

public class Calculator {
    public int a;
    public int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void addition() {
        System.out.println(a + b);
    }

    public void multiplication() {
        System.out.println(a * b);
    }

    public void subtraction() {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = scanner.nextInt();
        System.out.print("Enter b = ");
        int b = scanner.nextInt();

        Calculator calc = new Calculator(a, b);

        calc.addition();
        calc.multiplication();
        calc.subtraction();
    }
}