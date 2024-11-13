package at.mci.claudiasteiner.week3.exercise2;
import at.mci.claudiasteiner.week3.exercise2.ChemicalElement;

import java.util.HashMap;
import java.util.Map;

public class ChemicalElementManager {

    private static ChemicalElementManager INSTANCE = null;
    private static int counter = 0;

    // Instanzvariable, damit alle Methoden der Klasse darauf zugreifen können
    // final, damit sie nach der Initialisierung nicht verändert werden kann
    // erhöht Sicherheit und Schutz der Datenstruktur
    private final Map<String, ChemicalElement> elements;

    private ChemicalElementManager() {
        elements = new HashMap<>();
        System.out.println("ChemicalElementManager constructor");
    }

    public static ChemicalElementManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ChemicalElementManager();
            ++counter;
            System.out.println(counter + " Instance of ChemicalElementManager created");
        } else {
            System.out.println("NO ChemicalElementManager created");
        }
        return INSTANCE;
    }


    // Methode zum Hinzufügen eines ChemicalElement-Objekts zur HashMap
    public void addElement(ChemicalElement element) {
        if (element != null && !elements.containsKey(element.getSymbol())) {
            elements.put(element.getSymbol(), element);
            System.out.println("Element " + element.getName() + " added to the Periodic Table (HashMap).");
        } else {
            System.out.println("Element could not be added. It may already exist.");
        }
    }

    // Methode zum Abrufen eines Elements
    public ChemicalElement getElement(String symbol) {
        return elements.get(symbol);
    }

    // Methode zum Entfernen eines Elements
    public ChemicalElement removeElement(String symbol) {
        return elements.remove(symbol);
    }


    // Abrufen und Ausgeben eines Elements anhand des Symbols
    public void displayElement(String symbol) {
        ChemicalElement element = getElement(symbol);
        if (element != null) {
            System.out.println("*************************");
            System.out.println("The Element " + element.getName() + " has the following Attributes:");
            System.out.println(element);
            System.out.println("************************* \n");
        } else {
            System.out.println("Element not found.");
        }
    }
}

