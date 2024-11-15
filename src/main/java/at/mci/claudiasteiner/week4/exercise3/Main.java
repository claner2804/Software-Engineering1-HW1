package at.mci.claudiasteiner.week4.exercise3;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

                // Einzelne Mitarbeiter erstellen
                Employee employee1 = new Employee("Alice");
                Employee employee2 = new Employee("Bob");
                Employee employee3 = new Employee("Charlie");
                Employee employee4 = new Employee("David");
                Employee employee5 = new Employee("Emma");

                // Gruppen erstellen
                EmployeeGroup adminEmployees = new AdminEmployees("Admin Employees");
                EmployeeGroup researchers = new Researchers("Researchers");
                EmployeeGroup technicalStaff = new TechnicalStaff("Technical Staff");
                EmployeeGroup boardMembers = new BoardMembers("Board Members");

                // Mitarbeiter zu den Gruppen hinzufügen
                adminEmployees.addEmployee(employee1);
                researchers.addEmployee(employee2);
                researchers.addEmployee(employee5);
                technicalStaff.addEmployee(employee3);
                boardMembers.addEmployee(employee4);


                // Übergeordnete Struktur erstellen (CompanyDirectory)
                CompanyDirectory company = new CompanyDirectory();
                company.addGroup(adminEmployees);
                company.addGroup(researchers);
                company.addGroup(technicalStaff);
                company.addGroup(boardMembers);

                // Alle Informationen ausgeben
                System.out.println("== Company Directory ==");
                company.printInformation();
            }
        }
