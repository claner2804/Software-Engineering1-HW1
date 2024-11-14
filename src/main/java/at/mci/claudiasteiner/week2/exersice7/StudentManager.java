package at.mci.claudiasteiner.week2.exersice7;

import at.mci.claudiasteiner.week2.exersice6.Student;

import java.util.InputMismatchException;
import java.util.Scanner;
import at.mci.claudiasteiner.week2.exersice8.OutOfBoundsException;

/**
 * The type Student manager.
 */
public class StudentManager {
    private Scanner scanner;
    private Student[] students;

    /**
     * Instantiates a new Student manager.
     */
    public StudentManager() {
        scanner = new Scanner(System.in);
    }

    /**
     * Gets number of students.
     *
     * @return the number of students
     */
// Method to get and validate the number of students
    public int getNumberOfStudents() {
        int nrStud = 0;

        while (true) {
            try {
                System.out.println("Please enter the number of students: ");
                nrStud = scanner.nextInt();
                if (nrStud > 0) {
                    break; // Exit loop only if nrStud is greater than 0
                } else {
                    System.out.println("The number of students must be greater than 0. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for the number of students.");
                scanner.nextLine(); // Clear the invalid input from the scanner buffer
            }
        }

        System.out.println("The number of students is valid: " + nrStud);
        return nrStud;
    }

    /**
     * Create student array.
     *
     * @param nrStud the nr stud
     */
// Method to create an array of Student objects based on the number provided
    public void createStudentArray(int nrStud) {
        students = new Student[nrStud];
        System.out.println("Created an array for " + nrStud + " students.");
    }

    /**
     * Get students student [ ].
     *
     * @return the student [ ]
     */
// Getter for the Student array
    public Student[] getStudents() {
        return students;
    }


    /**
     * Gets nr objs to display.
     *
     * @return the nr objs to display
     */
    public int getNrObjsToDisplay() {
        int nrObjsToDisplay = 0;


        while (true) {
            try {
                System.out.println("Please enter the number of students to display: ");
                nrObjsToDisplay = scanner.nextInt();
                if (nrObjsToDisplay > 0 && nrObjsToDisplay < students.length+1) {
                    break; // Exit loop only if nrStud is greater than 0
                } else {
                    System.out.println("The number of students to display must be greater than 0. Please try again.");
                    throw new OutOfBoundsException("The number of students to display must be greater than 0.");
                }
            } catch (OutOfBoundsException e) {
                System.out.println("Invalid input. Please enter a valid integer for the number of students to display.");
                scanner.nextLine(); // Clear the invalid input from the scanner buffer
            }
        }

        System.out.println("The number of students to display is valid: " + nrObjsToDisplay);
        return nrObjsToDisplay;
    }


    /**
     * Display students.
     *
     * @param nrObjsToDisplay the nr objs to display
     */
    public void displayStudents(int nrObjsToDisplay) {
        try {
            // Validate nrObjsToDisplay
            if (nrObjsToDisplay <= 0 || nrObjsToDisplay > students.length+1) {
                throw new OutOfBoundsException("Invalid number of students to display. Out of bounds.");
            }

            // Display the information for the specified number of students
            for (int i = 0; i < nrObjsToDisplay; i++) {
                System.out.println("Student " + (i + 1) + ": " + students[i]);
            }
        } catch (OutOfBoundsException e) {
            System.out.println("Invalid input. Please enter a valid integer for the number of students to display.");
        }
    }


}
