package at.mci.claudiasteiner.vorbereitung3_Factory;

public class Main {

    public static void main(String[] args) {

        // Erstelle eine Kuh, ein Huhn und ein Schwein
        Animal cow = AnimalFactory.createAnimal("Kuh", "Holstein", 30, 5);
        Animal chicken = AnimalFactory.createAnimal("Huhn", "Legehuhn", 20, 18);
        Animal pig = AnimalFactory.createAnimal("Schwein", "Duroc", 100, 12);

        // Gebe die Beschreibung jedes Tieres aus
        System.out.println(cow.getDescription());
        System.out.println(chicken.getDescription());
        System.out.println(pig.getDescription());

    }

}
