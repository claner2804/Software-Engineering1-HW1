package at.mci.claudiasteiner.week2.exercise3;

import at.mci.claudiasteiner.week1.exercise2.Student;
import java.util.ArrayList;
import java.util.List;

public class TAStudent extends Student {
    private List<String> assignedCourses; // Liste der Kurse, in denen der Lehrassistent Aufgaben hat
    private List<String> tasks;           // Liste der Aufgaben, die dem Lehrassistenten zugewiesen sind

    // Konstruktor
    public TAStudent(String name, String group, int proficiencyInJava, int studentID, String gender) {
        super(name, group, proficiencyInJava, studentID, gender);
        this.assignedCourses = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    // Methode zum Hinzufügen eines Kurses
    public void addCourse(String course) {
        assignedCourses.add(course);
    }

    // Methode zum Hinzufügen einer Aufgabe
    public void addTask(String task) {
        tasks.add(task);
    }

    // Getter für die Liste der Kurse
    public List<String> getAssignedCourses() {
        return assignedCourses;
    }

    // Getter für die Liste der Aufgaben
    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return super.toString() + ", Assigned Courses: " + assignedCourses + ", Tasks: " + tasks;
    }
}

