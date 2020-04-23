package hw3;

public class Card {
    private String number;
    private String type;
    private String owner;
    private String terminate;
    int CCV;

    public Card(String number, String type, String owner, String terminate, int CCV) {
        this.number = number;
        this.type = type;
        this.owner = owner;
        this.terminate = terminate;
        this.CCV = CCV;
    }

    public class Validator {

        public void validateNumber() {
            if (number.length() != 16) {
                System.out.println("Card number is incorrect");
            } else {
                System.out.println("Card number is correct");
            }
        }

        public void validateType() {
            if (type == "Visa" | type == "MasterCard") {
                System.out.println("Card type is correct");
            } else {
                System.out.println("Card number is incorrect");
            }
        }

        public void validateOwner() {
            if (owner.trim().length() != 0) {
                System.out.println("Card owner is correct");
            } else {
                System.out.println("Card number is incorrect");
            }
        }

        public void validateTerminate() {
            if (terminate.length() != 5) {
                System.out.println("Card termin is incorrect");
            } else {
                System.out.println("Card termin is correct");
            }
        }

        public void validateCCV() {
            if (String.valueOf(CCV).length() == 3) {
                System.out.println("CCV number is correct");
            } else {
                System.out.println("CCV number is incorrect");
            }
        }
    }
}