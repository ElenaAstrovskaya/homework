package hw5.Alphabet;

public enum EAlphabet {A, B, C ,D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

    public int getLetterPosition(){
        return ordinal() + 1;
    }
}