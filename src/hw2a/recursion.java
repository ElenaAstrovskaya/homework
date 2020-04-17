package hw2a;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner4.nextInt();

        boolean result = recursion(n, 2);

        if(result){
            System.out.printf("Is number n = %d simple? - YES", n);
        }else {
            System.out.printf("Is number n = %d simple? - NO", n);
        }

    }

    public static boolean recursion(int n, int divider){
        if(n < 2){
            return false;
        }else {
            if(n == 2 | n == 3 ){
                return true;
            }else {
                if(n % 2 == 0 | n % 3 == 0){
                    return false;
                }else {
                    if(divider < n / 2){
                        return recursion(n, divider + 1);
                    }else {
                        return true;
                    }
                }
            }
        }
    }
}
