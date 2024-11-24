package at.mci.claudiasteiner.vorbereitung3_Factory;

public class AnimalFactory {


    //statische Methode createAnimal, die den Typ des Tieres und die spezifischen Parameter akzeptiert.
    //Abhängig vom Typ wird das entsprechende Tierobjekt erstellt.
    public static Animal createAnimal(String animalType, String breedOrType, float param1, int age) {
        // Schalter zum Überprüfen des Tier-Typs (in Kleinbuchstaben konvertiert)
        switch (animalType.toLowerCase()) {
            // Fall: Typ ist "Kuh" -> Erstelle und gib eine Kuh zurück
            case "kuh":
                return new Cow(breedOrType, param1, age);
            // Fall: Typ ist "Huhn" -> Erstelle und gib ein Huhn zurück (param1 wird in int umgewandelt)
            case "huhn":
                return new Chicken(breedOrType, (int)param1, age);
            // Fall: Typ ist "Schwein" -> Erstelle und gib ein Schwein zurück
            case "schwein":
                return new Pig(breedOrType, param1, age);
            // Standardfall: Unbekannter Tier-Typ -> Gib null zurück
            default:
                return null;
        }
    }



}
