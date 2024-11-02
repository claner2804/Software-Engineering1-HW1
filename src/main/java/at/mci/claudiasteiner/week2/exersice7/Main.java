package at.mci.claudiasteiner.week2.exersice7;
import at.mci.claudiasteiner.week2.exersice6.Student;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {



        /*
        7. Create an array Student[] of nrStud Student objects.
        The value nrStud should be entered as input from the console.
        Ensure that the input is ok (you could use the static method parseInt() of a wrapper class)
         */

        Scanner scanner = new Scanner(System.in);

        int nrStud;

        while (true) {
            nrStud = 0;
            try {
                System.out.println("Please enter the Number of students: ");
                nrStud = scanner.nextInt();
                if (nrStud > 0) {
                    break; // Exit loop only if nrStud is greater than 0
                } else {
                    System.out.println("nrStud must be greater than 0. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for nrStud.");
                scanner.nextLine(); // Clear the invalid input from the scanner buffer
            }
        }

        System.out.println("The number of Students is Valid. It is now: " + nrStud);

        Student[] students = new Student[nrStud];


    }
}
