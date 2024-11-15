package at.mci.claudiasteiner.week4.exercise3;

import java.util.ArrayList;
import java.util.List;

//ine abstrakte Klasse kann nicht direkt instanziiert werden.
// Stattdessen dient sie als Basis für andere Klassen, die von ihr erben.

public abstract class EmployeeGroup implements Directory {
    private String name;
    private List<Directory> employees = new ArrayList<>();

    public EmployeeGroup(String name) {
        this.name = name;
    }

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
