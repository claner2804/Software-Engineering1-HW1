package at.mci.claudiasteiner.week2.exersice6;

import java.util.*;


/**
 * Die Klasse Student repräsentiert einen Studenten mit spezifischen Eigenschaften wie Name,
 * Gruppe, Java-Kenntnisse, Geschlecht und Noten.
 */
public class Student {
    /**
     * The Name.
     */
    protected String name;
    /**
     * The Group.
     */
    protected String group;
    /**
     * The Proficiency in java.
     */
    protected int proficiencyInJava;
    /**
     * The Student id.
     */
    protected int studentID;
    /**
     * The Gender.
     */
    protected String gender;
    /**
     * The constant counter.
     */
    public static int counter = 0;

    //Exercise 6
    private List<Integer> grades;



/*
6. Adapt the Student class that you created in Assignment 1 for it
to accept console input
for the addition of a new Student object that does type checking
and a minimum of input validation
You can use the parseDouble() or similar methods in the wrapper classes
to input numeric values
 */


    /**
     * Instantiates a new Student.
     */
//Input-Validating Constructor
    public Student() {

        // Exercise 6: Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        while (name == null || name.isEmpty()) {
            System.out.print("Enter student name: ");
            name = in.nextLine();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please enter a valid name.");
            }
        }

        while (group == null || group.isEmpty()) {
            System.out.print("Enter group: ");
            group = in.nextLine();
            if (group.isEmpty()) {
                System.out.println("Group cannot be empty. Please enter a valid group.");
            }
        }

        while (true) {
            try {
                System.out.print("Enter proficiency (between 0 and 100): ");
                proficiencyInJava = in.nextInt();
                in.nextLine(); // Consume the newline

                System.out.print("Enter studentID: ");
                studentID = in.nextInt();
                in.nextLine(); // Consume the newline

                // Check for positive values
                if (studentID <= 0 || proficiencyInJava <= 0 || proficiencyInJava > 100) {
                    throw new InputMismatchException("Proficiency in Java and studentID must be positive numbers. " +
                            "Proficiency in Java must be between 0 and 100. Please try again.");
                }

                break; // Exit loop if input is valid

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, proficiencyInJava and studentID must be positive numbers.");
                in.nextLine(); // Clear invalid input
            }
        }

        while (true) {
            try {
                System.out.print("Enter gender (m or w): ");
                gender = in.nextLine(); // Now correctly reads the gender input
                if (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("w")) {
                    throw new InputMismatchException("Gender must be either 'm' or 'w'.");
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Gender must be either 'm' or 'w'. Please try again.");
            }

        }

        System.out.print("you entered the values: " + name + ", " + group + ", " + proficiencyInJava + ", " + studentID + ", " + gender + "\n");

        this.grades = new ArrayList<>();

        // Exercise 7
        counter++;
        System.out.println("New Student added! There are a total of " + counter + " students");
    }


    /**
     * Konstruktor, der alle Datenfelder eines Studenten initialisiert.
     *
     * @param name              der Name des Studenten
     * @param group             die Gruppe des Studenten
     * @param proficiencyInJava die Java-Kenntnisse des Studenten
     * @param studentID         die Studenten-ID
     * @param gender            das Geschlecht des Studenten
     */
//Constructor
    public Student(String name, String group, int proficiencyInJava, int studentID, String gender) {
        this.name = name;
        this.group = group;
        this.proficiencyInJava = proficiencyInJava;
        this.studentID = studentID;
        this.gender = gender;
        this.grades = new ArrayList<>(); // Initialize grades list
        //Exercise 7
        counter++;
        System.out.println("New Student added! There are a total of " + counter + " students");

    }


    /**
     * Fügt eine Note zur Liste der Noten hinzu.
     *
     * @param grade die Note, die hinzugefügt wird
     */
// Method to add a grade
    public void addGrade(int grade) {
        grades.add(grade);
    }


    /**
     * Gets grades.
     *
     * @return the grades
     */
// Getter for grades
    public List<Integer> getGrades() {
        return grades;
    }


    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets group.
     *
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets group.
     *
     * @param group the group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Gets proficiency in java.
     *
     * @return the proficiency in java
     */
    public int getProficiencyInJava() {
        return proficiencyInJava;
    }

    /**
     * Sets proficiency in java.
     *
     * @param proficiencyInJava the proficiency in java
     */
    public void setProficiencyInJava(int proficiencyInJava) {
        this.proficiencyInJava = proficiencyInJava;
    }

    /**
     * Gets student id.
     *
     * @return the student id
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * Sets student id.
     *
     * @param studentID the student id
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * Gets gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     *
     * @param gender the gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "The Student " +
                "named " + name +
                " in Group " + group + "\n"  +
                "has a proficiencyInJava of Level " + proficiencyInJava + "\n" +
                "studentID = " + studentID + ", " +
                "gender = " + gender + "\n";
    }


    /**
     * Has same fluency in java as boolean.
     *
     * @param anotherStudent the another student
     * @return the boolean
     */
//Exercise4
    public boolean hasSameFluencyInJavaAs(at.mci.claudiasteiner.week1.exercise2.Student anotherStudent) {
        if(this.proficiencyInJava != anotherStudent.getProficiencyInJava()) {
            System.out.println("nah bihhh " + this.name + " and " + anotherStudent.getName() + " dont matchhh");
            return false;
        }
        System.out.println("yeahhh " + this.name + " and " + anotherStudent.getName() + " got the same FluencyInJava");
        return true;
    }


    //Exercise5
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Same object in memory, so they are equal.
        if (o == null || getClass() != o.getClass()) return false; // Null or not a Student, return false.

        at.mci.claudiasteiner.week1.exercise2.Student student = (at.mci.claudiasteiner.week1.exercise2.Student) o; // Safe cast as both objects are confirmed to be Student.

        // Field-by-field comparison
        return getProficiencyInJava() == student.getProficiencyInJava()
                && getStudentID() == student.getStudentID()
                && Objects.equals(getName(), student.getName())
                && Objects.equals(getGroup(), student.getGroup())
                && Objects.equals(getGender(), student.getGender());
    }


    /**
     * Berechnet die Durchschnittsnote über alle Kurse des Studenten.
     *
     * @return die Durchschnittsnote als float, oder 0, wenn keine Noten vorhanden sind
     */
//Exercise 6
    //Method to calculate the average grade
    public float averageNote() {
        if (grades.isEmpty()) {
            return 0; // Return 0 if no grades are present to avoid division by zero
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (float) sum / grades.size();
    }



}
