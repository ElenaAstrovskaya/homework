package hw3;

public class bank {
    public static void main(String[] args) {
        Card card1 = new Card("1111 1111 1111", "Vaza", " ", "1125", 2345);
        Card card2 = new Card("1234 1234 1234 1234", "Visa", "Ivan Ivanov", "12/24", 123);

        card1.validateDisplay();
        System.out.println("All done");
        System.out.println(" ");

        card2.validateDisplay();
        System.out.println("All done");
    }
}


