package at.mci.claudiasteiner.week4.exercise3;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Directory {
    private List<Directory> employeeGroups = new ArrayList<>();

    public void addGroup(Directory group) {
        employeeGroups.add(group);
    }

    @Override
    public void printInformation() {
        for (Directory group : employeeGroups) {
            group.printInformation();
        }
    }
}
