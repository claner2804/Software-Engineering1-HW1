package at.mci.claudiasteiner.vorbereitung3;

public class Pig implements Animal {
    //Rasse, Gewicht (in Kilogramm), Alter (in Monaten).
    private String breed;
    private float weight;
    private int age; //in monate


    public Pig(String breed, float weight, int age) {
        this.breed = breed;
        this.weight = weight;
        this.age = age;
    }


    @Override
    public String getDescription() {
        return "Schwein der Rasse " + breed + ", Gewicht: " + weight + " kg, Alter: " + age + " Monate";
    }
}
