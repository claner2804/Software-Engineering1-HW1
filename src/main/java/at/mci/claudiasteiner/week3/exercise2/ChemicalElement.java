package at.mci.claudiasteiner.week3.exercise2;

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



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(double atomicMass) {
        this.atomicMass = atomicMass;
    }

    public double getMeltingPoint() {
        return meltingPoint;
    }
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

        // Konstruktor des Builders, der die Muss-Eigenschaften verlangt
        public Builder(String name, String symbol, int atomicNumber) {
            this.name = name;
            this.symbol = symbol;
            this.atomicNumber = atomicNumber;
        }

        // Methode zum Setzen der Atommasse
        public Builder setAtomicMass(double atomicMass) {
            this.atomicMass = atomicMass;
            return this;
        }

        // Methode zum Setzen des Schmelzpunkts
        public Builder setMeltingPoint(double meltingPoint) {
            this.meltingPoint = meltingPoint;
            return this;
        }

        // Methode zum Setzen der Elektronegativität
        public Builder setElectronegativity(double electronegativity) {
            this.electronegativity = electronegativity;
            return this;
        }

        // Methode zum Erstellen eines ChemicalElement-Objekts
        public ChemicalElement build() {
            return new ChemicalElement(this);
        }
    }
}
