package at.mci.claudiasteiner.week1.exercise3;

import at.mci.claudiasteiner.week1.exercise2.Student;

/**
 * The type Test student.
 */
public class TestStudent {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Student claudia = new Student();
        claudia.setName("Claudia");
        claudia.setGroup("Software Engineering");
        claudia.setProficiencyInJava(2);
        claudia.setStudentID(123);
        claudia.setGender("w");
        System.out.println(claudia);

        System.out.println("+++++++++++++++++++++++");


        Student dominic = new Student("Dominic","Seafreight",0,456,"m");
        System.out.println(dominic);
        System.out.println(dominic.getStudentID() + " before using setter");
        dominic.setStudentID(12);
        System.out.println(dominic.getStudentID() + " after using setter");

        System.out.println("+++++++++++++++++++++++");


        Student manuel = new Student("Manuel","Consultant",3,789,"m");
        System.out.println(manuel);


        System.out.println("+++++++++++++++++++++++");


        Student sandra = new Student("Sandra","Sales",0,379,"w");
        System.out.println(sandra);


        System.out.println("+++++++++++++++++++++++");


        //Invoking Dummy Constructor to prove Java sets values to zero
        Student sara = new Student();
        System.out.println(sara);



        System.out.println("+++++++++++++++++++++++");

        claudia.hasSameFluencyInJavaAs(dominic);

        dominic.hasSameFluencyInJavaAs(sara);


    }

}
