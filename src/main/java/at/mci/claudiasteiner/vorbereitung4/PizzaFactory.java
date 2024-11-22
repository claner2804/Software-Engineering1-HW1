package at.mci.claudiasteiner.vorbereitung4;

public class PizzaFactory {

    //statische Methode createPizza, die die Bestellnummer nimmt
    //Abhängig davon wird das entsprechende Pizzaobjekt erstellt.
    public static Pizza createPizza(int orderNumber) throws Exception {
        // Schalter zum Überprüfen der Bestellnummer
        switch (orderNumber) {
            // Fall: Nummer ist 1 -> Erstelle und gib eine Margherita zurück
            case 1:
                return new Margherita();
            // Fall: Nummer ist 2 -> Erstelle und gib eine Salami
            case 2:
                return new Salami();
            // Fall: Nummer ist 2 -> Erstelle und gib eine Vegan
            case 3:
                return new Vegan();
            // Standardfall: Unbekannte Nummer  -> Gib null zurück
            default:
                throw new Exception("Unbekannte Bestellnummer: " + orderNumber);
        }
    }


}
