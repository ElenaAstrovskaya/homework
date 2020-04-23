package hw3;

public class bank {
    public static void main(String[] args) {
        Card card1 = new Card("1111 1111 1111", "Vaza", " ", "1125", 2345);
        Card.Validator number1 = card1.new Validator();
        Card.Validator type1 = card1.new Validator();
        Card.Validator owner1 = card1.new Validator();
        Card.Validator terminate1 = card1.new Validator();
        Card.Validator CCV1 = card1.new Validator();

        Card card2 = new Card("1234123412341234", "Visa", "Ivan Ivanov", "12/24", 123);
        Card.Validator number2 = card2.new Validator();
        Card.Validator type2 = card2.new Validator();
        Card.Validator owner2 = card2.new Validator();
        Card.Validator terminate2 = card2.new Validator();
        Card.Validator CCV2 = card2.new Validator();

        number1.validateNumber();
        type1.validateType();
        owner1.validateOwner();
        terminate1.validateTerminate();
        CCV1.validateCCV();
        System.out.println("All done");
        System.out.println(" ");

        number2.validateNumber();
        type2.validateType();
        owner2.validateOwner();
        terminate2.validateTerminate();
        CCV2.validateCCV();
        System.out.println("All done");
    }
}


