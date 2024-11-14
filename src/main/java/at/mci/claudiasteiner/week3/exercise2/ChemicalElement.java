package at.mci.claudiasteiner.week3.exercise2;

/**
 * The type Chemical element.
 */
public class ChemicalElement {

    // Muss-Eigenschaften
    private String name;
    private String symbol;
    private int atomicNumber;

    //optionale Eigenschaften
    private double atomicMass;
    private double meltingPoint;
    private double electronegativity;

    // Privater Konstruktor, um sicherzustellen, dass nur der Builder ein ChemicalElement erstellen kann
    private ChemicalElement(Builder builder) {
        this.name = builder.name;
        this.symbol = builder.symbol;
        this.atomicNumber = builder.atomicNumber;
        this.atomicMass = builder.atomicMass;
        this.meltingPoint = builder.meltingPoint;
        this.electronegativity = builder.electronegativity;
    }


    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets symbol.
     *
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets symbol.
     *
     * @param symbol the symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Gets atomic number.
     *
     * @return the atomic number
     */
    public int getAtomicNumber() {
        return atomicNumber;
    }

    /**
     * Sets atomic number.
     *
     * @param atomicNumber the atomic number
     */
    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    /**
     * Gets atomic mass.
     *
     * @return the atomic mass
     */
    public double getAtomicMass() {
        return atomicMass;
    }

    /**
     * Sets atomic mass.
     *
     * @param atomicMass the atomic mass
     */
    public void setAtomicMass(double atomicMass) {
        this.atomicMass = atomicMass;
    }

    /**
     * Gets melting point.
     *
     * @return the melting point
     */
    public double getMeltingPoint() {
        return meltingPoint;
    }

    /**
     * Sets melting point.
     *
     * @param meltingPoint the melting point
     */
    public void setMeltingPoint(double meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    @Override
    public String toString() {
        return "Name = " + name + "\n" +
                "Symbol = " + symbol + "\n" +
                "Atomic Number = " + atomicNumber + "\n" +
                "Atomic Mass = " + atomicMass + "\n" +
                "Melting Point = " + meltingPoint + "\n" +
                "Electronegativity = " + electronegativity;
    }

    /**
     * The type Builder.
     */
// Statische innere Klasse Builder
    public static class Builder {
        // Muss-Eigenschaften
        private final String name;
        private final String symbol;
        private final int atomicNumber;

        // Optionale Eigenschaften
        private double atomicMass = 0.0; // Standardwert für optionale Eigenschaften
        private double meltingPoint = 0.0;
        private double electronegativity = 0.0;

        /**
         * Instantiates a new Builder.
         *
         * @param name         the name
         * @param symbol       the symbol
         * @param atomicNumber the atomic number
         */
// Konstruktor des Builders, der die Muss-Eigenschaften verlangt
        public Builder(String name, String symbol, int atomicNumber) {
            this.name = name;
            this.symbol = symbol;
            this.atomicNumber = atomicNumber;
        }

        /**
         * Sets atomic mass.
         *
         * @param atomicMass the atomic mass
         * @return the atomic mass
         */
// Methode zum Setzen der Atommasse
        public Builder setAtomicMass(double atomicMass) {
            this.atomicMass = atomicMass;
            return this;
        }

        /**
         * Sets melting point.
         *
         * @param meltingPoint the melting point
         * @return the melting point
         */
// Methode zum Setzen des Schmelzpunkts
        public Builder setMeltingPoint(double meltingPoint) {
            this.meltingPoint = meltingPoint;
            return this;
        }

        /**
         * Sets electronegativity.
         *
         * @param electronegativity the electronegativity
         * @return the electronegativity
         */
// Methode zum Setzen der Elektronegativität
        public Builder setElectronegativity(double electronegativity) {
            this.electronegativity = electronegativity;
            return this;
        }

        /**
         * Build chemical element.
         *
         * @return the chemical element
         */
// Methode zum Erstellen eines ChemicalElement-Objekts
        public ChemicalElement build() {
            return new ChemicalElement(this);
        }
    }
}
