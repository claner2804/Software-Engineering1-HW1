package at.mci.claudiasteiner.week3.exercise4;

/**
 * The type Beverage.
 */
public class Beverage {
    private final String type; // z. B. Kaffee, Tee
    private final String size; // z. B. klein, mittel, groß
    private final String temperature; // z. B. heiß, warm, kalt
    private final boolean hasMilk;
    private final boolean hasCream;
    private final boolean hasSugar;

    // Privater Konstruktor
    private Beverage(BeverageBuilder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.temperature = builder.temperature;
        this.hasMilk = builder.hasMilk;
        this.hasCream = builder.hasCream;
        this.hasSugar = builder.hasSugar;
    }

    @Override
    public String toString() {
        return "Beverage: " + type + ", Size: " + size + ", Temperature: " + temperature +
                ", Milk: " + (hasMilk ? "Yes" : "No") +
                ", Cream: " + (hasCream ? "Yes" : "No") +
                ", Sugar: " + (hasSugar ? "Yes" : "No");
    }

    /**
     * The type Beverage builder.
     */
// Static inner Builder class
    public static class BeverageBuilder {
        private String type;
        private String size;
        private String temperature;
        private boolean hasMilk = false;
        private boolean hasCream = false;
        private boolean hasSugar = false;

        /**
         * Instantiates a new Beverage builder.
         *
         * @param type the type
         */
// Konstruktor für verpflichtende Attribute
        public BeverageBuilder(String type) {
            this.type = type;
        }

        /**
         * Sets size.
         *
         * @param size the size
         * @return the size
         */
// Setter für optionale Eigenschaften
        public BeverageBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        /**
         * Sets temperature.
         *
         * @return the temperature
         */
        public BeverageBuilder setTemperature(String temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * Add milk beverage builder.
         *
         * @return the beverage builder
         */
        public BeverageBuilder addMilk() {
            this.hasMilk = true;
            return this;
        }

        /**
         * Add cream beverage builder.
         *
         * @return the beverage builder
         */
        public BeverageBuilder addCream() {
            this.hasCream = true;
            return this;
        }

        /**
         * Add sugar beverage builder.
         *
         * @return the beverage builder
         */
        public BeverageBuilder addSugar() {
            this.hasSugar = true;
            return this;
        }

        /**
         * Build beverage.
         *
         * @return the beverage
         */
// Build-Methode, um das fertige Beverage-Objekt zu erstellen
        public Beverage build() {
            return new Beverage(this);
        }
    }
}