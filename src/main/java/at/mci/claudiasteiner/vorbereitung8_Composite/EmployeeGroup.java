package at.mci.claudiasteiner.vorbereitung8_Composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeGroup implements Directory {

    private final String name;
    private List<Directory> employees = new ArrayList<>();

    public EmployeeGroup(String name) {
        this.name = name;
    }

    public void addEmployee(Directory employee) {
        employees.add(employee);
    }

    @Override
    public void printInfo() {
        System.out.println("Group: " + name);
        for (Directory employee : employees) {
            employee.printInfo();
        }

    }
}
