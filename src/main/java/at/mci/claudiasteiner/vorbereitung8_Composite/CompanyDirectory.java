package at.mci.claudiasteiner.vorbereitung8_Composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Directory {

    private final List<Directory> employeeGroup = new ArrayList<>();

    public void addGroup(Directory group) {
        employeeGroup.add(group);
    }

    @Override
    public void printInfo() {
        for (Directory group : employeeGroup) {
            group.printInfo();
            System.out.println("******************");
        }
    }
}
