package at.mci.claudiasteiner.week3.exercise2;

/**
 * The type Chemical element factory.
 */
public class ChemicalElementFactory {

    /**
     * Create element chemical element . builder.
     *
     * @param name         the name
     * @param symbol       the symbol
     * @param atomicNumber the atomic number
     * @return the chemical element . builder
     */
//  Factory-Methode, damit sie einen Builder zurückgibt
    public static ChemicalElement.Builder createElement(String name, String symbol, int atomicNumber) {
        // Erstelle einen Builder mit den Pflichtwerten und gib ihn zurück
        System.out.println("Factory: Creating Builder for ChemicalElement " + name);
        return new ChemicalElement.Builder(name, symbol, atomicNumber);
    }
}
