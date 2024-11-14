package at.mci.claudiasteiner.week2.exersice7;


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
        StudentManager manager = new StudentManager(); // Create an instance of StudentManager

        int nrStud = manager.getNumberOfStudents(); // Get and validate the number of students
        manager.createStudentArray(nrStud); // Create the array of Student objects

        // Exercise 8: Ask the user for the number of students to display

        int nrObjsToDisplay = manager.getNrObjsToDisplay();
        manager.displayStudents(nrObjsToDisplay);
    }
}





