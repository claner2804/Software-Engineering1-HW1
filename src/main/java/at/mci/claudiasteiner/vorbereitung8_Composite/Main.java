package at.mci.claudiasteiner.vorbereitung8_Composite;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Claudi","Boss");
        Employee employee2 = new Employee("Manu","Boss");

        Employee employee3 = new Employee("Tobi","Software Engineering");
        Employee employee4 = new Employee("Olli","Project Manager");


        EmployeeGroup managers = new EmployeeGroup("Managers");
        EmployeeGroup simpleEmployees = new EmployeeGroup("Employees");

        managers.addEmployee(employee1);
        managers.addEmployee(employee2);
        simpleEmployees.addEmployee(employee3);
        simpleEmployees.addEmployee(employee4);


        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addGroup(managers);
        companyDirectory.addGroup(simpleEmployees);


        System.out.println("**** Company Directory ****");
        companyDirectory.printInfo();


    }
}
