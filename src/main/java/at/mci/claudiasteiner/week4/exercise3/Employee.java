package at.mci.claudiasteiner.week4.exercise3;

//Leaf
// Das ist die einfachste Einheit der Baumstruktur,
// z.B. ein Employee im MCI. Leaf hat keine
// untergeordneten Elemente. Es implementiert die
// Component-Schnittstelle.


/**
 * The type Employee.
 */
public class Employee implements Directory {
    private final String name;


    /**
     * Instantiates a new Employee.
     *
     * @param name the name
     */
    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void printInformation() {
        System.out.println("Employee: " + name);
    }
}


