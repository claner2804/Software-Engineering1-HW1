package at.mci.claudiasteiner.week3.exercise4;

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
        // Erstelle ein Getränk (z. B. Kaffee mit Milch und Zucker)
        Beverage coffee = new Beverage.BeverageBuilder("Coffee")
                .setSize("Large")
                .setTemperature("Hot")
                .addMilk()
                .addSugar()
                .build();

        Beverage tea = new Beverage.BeverageBuilder("Tea")
                .setSize("Medium")
                .setTemperature("Cold")
                .addSugar()
                .build();


        System.out.println(coffee);
        System.out.println(tea);
    }
}
