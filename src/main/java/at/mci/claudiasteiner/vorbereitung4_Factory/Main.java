package at.mci.claudiasteiner.vorbereitung4_Factory;

public class Main {

    public static void main(String[] args) {

        try {

            Pizza pizza1 = PizzaFactory.createPizza(1);

            Pizza pizza2 = PizzaFactory.createPizza(2);

            Pizza pizza3 = PizzaFactory.createPizza(3);

            Pizza pizza4 = PizzaFactory.createPizza(4);

        } catch (Exception e) {
            System.out.println("Fehler: " + e.getMessage());;
        }
    }
}
