package at.mci.claudiasteiner.week3.exercise2;

public class ChemicalElementFactory {

    //  Factory-Methode, damit sie einen Builder zurückgibt
    public static ChemicalElement.Builder createElement(String name, String symbol, int atomicNumber) {
        // Erstelle einen Builder mit den Pflichtwerten und gib ihn zurück
        System.out.println("Factory: Creating Builder for ChemicalElement " + name);
        return new ChemicalElement.Builder(name, symbol, atomicNumber);
    }
}
