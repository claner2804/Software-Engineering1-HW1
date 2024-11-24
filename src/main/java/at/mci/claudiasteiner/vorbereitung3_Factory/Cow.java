package at.mci.claudiasteiner.vorbereitung3_Factory;

public class Cow implements Animal {

    //Rasse, Milchleistung (in Litern pro Tag), Alter (in Jahren).
    private String breed;
    private float milkProduction;
    private int age; //in jahren


    public Cow(String breed, float milkProduction, int age) {
        this.breed = breed;
        this.milkProduction = milkProduction;
        this.age = age;
    }

    @Override
    public String getDescription() {
        return "Kuh der Rasse " + breed + " , Milchproduktion: " + milkProduction + " Liter/Tag, Alter:  " + age + " Jahre";
    }
}
