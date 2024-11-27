package at.mci.claudiasteiner.vorbereitung8_Composite;

public class Employee implements Directory {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }


    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
    }
}
