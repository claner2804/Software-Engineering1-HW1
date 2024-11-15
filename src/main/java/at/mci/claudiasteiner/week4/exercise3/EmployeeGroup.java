package at.mci.claudiasteiner.week4.exercise3;

import java.util.ArrayList;
import java.util.List;

//ine abstrakte Klasse kann nicht direkt instanziiert werden.
// Stattdessen dient sie als Basis für andere Klassen, die von ihr erben.

/**
 * The type Employee group.
 */
public abstract class EmployeeGroup implements Directory {
    private final String name;
    private List<Directory> employees = new ArrayList<>();

    /**
     * Instantiates a new Employee group.
     *
     * @param name the name
     */
    public EmployeeGroup(String name) {
        this.name = name;
    }

    /**
     * Add employee.
     *
     * @param employee the employee
     */
    public void addEmployee(Directory employee) {
        employees.add(employee);
    }

    @Override
    public void printInformation() {
        System.out.println("***********************");
        System.out.println("Group: " + name);
        for (Directory employee : employees) {
            employee.printInformation();
        }
    }
}
