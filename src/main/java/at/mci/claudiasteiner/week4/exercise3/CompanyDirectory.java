package at.mci.claudiasteiner.week4.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Company directory.
 */
public class CompanyDirectory implements Directory {
    private final List<Directory> employeeGroups = new ArrayList<>();

    /**
     * Add group.
     *
     * @param group the group
     */
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
