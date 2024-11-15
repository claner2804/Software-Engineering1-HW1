package at.mci.claudiasteiner.week4.exercise2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MaskingInputStream extends FilterInputStream {

    // Zu maskierende Zeichen
    private static final char[] MASK_CHARACTERS = {'a', 'e', 'z'};

    // Konstruktor, der den InputStream annimmt
    protected MaskingInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int character = super.read();

        // Überprüfen, ob das Zeichen maskiert werden soll
        if (character == -1) {
            return -1; // Ende des Streams
        }
        for (char maskChar : MASK_CHARACTERS) {
            if (character == maskChar) {
                return '*'; // Zeichen wird maskiert
            }
        }
        return character; // Originalzeichen wird zurückgegeben
    }
}
