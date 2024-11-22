package at.mci.claudiasteiner.vorbereitung3;

public class Chicken implements Animal {

    //Art, Eierproduktion (in Eiern pro Woche), Alter (in Monaten).
    private String type;
    private int eggProduction;
    private int age; //in monaten

    public Chicken(String type, int eggProduction, int age) {
        this.type = type;
        this.eggProduction = eggProduction;
        this.age = age;
    }


    @Override
    public String getDescription() {
        return "Huhn vom Typ " + type + ", Eierproduktion: " + eggProduction + " Eier/Woche, Alter: " + age + " Monate";
    }
}
