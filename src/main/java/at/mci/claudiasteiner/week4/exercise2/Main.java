package at.mci.claudiasteiner.week4.exercise2;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe vom Benutzer
        System.out.print("Geben Sie einen Text ein, der maskiert werden soll: ");
        String input = scanner.nextLine();

        // Eingabe in einen InputStream umwandeln
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        // MaskingInputStream verwenden
        try (MaskingInputStream maskingInputStream = new MaskingInputStream(inputStream)) {
            int character;
            System.out.println("Maskierte Ausgabe: ");
            while ((character = maskingInputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}
