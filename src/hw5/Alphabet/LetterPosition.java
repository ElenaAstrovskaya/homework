package hw5.Alphabet;

public class LetterPosition {
    public static void main(String[] args) {

        EAlphabet[] alphabets = EAlphabet.values();
        for (EAlphabet alphabet : alphabets)
            System.out.println(alphabet.name() + " - " + alphabet.getLetterPosition());
    }
}
