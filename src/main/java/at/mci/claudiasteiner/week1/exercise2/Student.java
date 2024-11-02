package at.mci.claudiasteiner.week1.exercise2;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;



/**
 * Die Klasse Student repräsentiert einen Studenten mit spezifischen Eigenschaften wie Name,
 * Gruppe, Java-Kenntnisse, Geschlecht und Noten.
 */
public class Student {
    protected String name;
    protected String group;
    protected int proficiencyInJava;
    protected int studentID;
    protected String gender;
    public static int counter = 0;

    //Exercise 6
    private List<Integer> grades;


    /**
     * Konstruktor ohne Parameter. Initialisiert den Namen als "dummy" und eine leere Notenliste.
     */
    //dummy-Constructor
    public Student() {
        this.name = "dummy";
        this.grades = new ArrayList<>(); // Initialize grades list
        //Exercise 7
        counter++;
        System.out.println("New Student added! There are a total of " + counter + " students");
    }




    /**
     * Konstruktor, der alle Datenfelder eines Studenten initialisiert.
     *
     * @param name der Name des Studenten
     * @param group die Gruppe des Studenten
     * @param proficiencyInJava die Java-Kenntnisse des Studenten
     * @param studentID die Studenten-ID
     * @param gender das Geschlecht des Studenten
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


    // Getter for grades
    public List<Integer> getGrades() {
        return grades;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getProficiencyInJava() {
        return proficiencyInJava;
    }

    public void setProficiencyInJava(int proficiencyInJava) {
        this.proficiencyInJava = proficiencyInJava;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getGender() {
        return gender;
    }

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


    //Exercise4
    public boolean hasSameFluencyInJavaAs(Student anotherStudent) {
        if(this.proficiencyInJava != anotherStudent.getProficiencyInJava()) {
            System.out.println("nah bihhh " + this.name + " and " + anotherStudent.name + " dont matchhh");
            return false;
        }
        System.out.println("yeahhh " + this.name + " and " + anotherStudent.name + " got the same FluencyInJava");
        return true;
    }


    //Exercise5
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Same object in memory, so they are equal.
        if (o == null || getClass() != o.getClass()) return false; // Null or not a Student, return false.

        Student student = (Student) o; // Safe cast as both objects are confirmed to be Student.

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
