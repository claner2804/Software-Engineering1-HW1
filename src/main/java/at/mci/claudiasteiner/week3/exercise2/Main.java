package at.mci.claudiasteiner.week3.exercise2;
import at.mci.claudiasteiner.week3.exercise2.ChemicalElementManager;

public class Main {
    public static void main(String[] args) {

        // Singleton Pattern
        // Erstelle die Singleton-Instanz des Managers
        ChemicalElementManager chemicalElementManager = ChemicalElementManager.getInstance();

        // Builder Pattern
        // Erstelle ein ChemicalElement-Objekt mit allen Eigenschaften über den Builder
        ChemicalElement hydrogen = ChemicalElementFactory.createElement("Hydrogen", "H", 1)
                .setAtomicMass(1.008)
                .setMeltingPoint(-259.14)
                .setElectronegativity(2.2)
                .build();

        // Füge das Element der HashMap hinzu
        chemicalElementManager.addElement(hydrogen);

        // Erstelle ein weiteres ChemicalElement-Objekt
        ChemicalElement helium = ChemicalElementFactory.createElement("Helium", "He", 2)
                .setAtomicMass(4.0026)
                .setMeltingPoint(-272.2)
                .build();

        // Füge das zweite Element der HashMap hinzu
        chemicalElementManager.addElement(helium);

        // Gebe Elemente aus
        chemicalElementManager.displayElement("H");
        chemicalElementManager.displayElement("He");

    }
}

