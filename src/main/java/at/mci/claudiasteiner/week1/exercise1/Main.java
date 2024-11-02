package at.mci.claudiasteiner.week1.exercise1;

public class Main {

    //public static void main is the entry point
    //you can always call static methods even if you do not have objects
    //psvm is a static data member of the Main class
    public static void main(String[] args){
    Student_1 clemens,
            andrea,
            tobias;

    clemens = new Student_1("Wanna be clemens", "aaaaa");
    tobias = new Student_1();


    System.out.println("Clemens and Tobias after creation");
    System.out.println("+++++++++++++++++++");

    System.out.println(clemens.printStudentInfo());

    System.out.println("+++++++++++++++++++");

    System.out.println(tobias.printStudentInfo());

    System.out.println("+++++++++++++++++++");

    System.out.println("There are " + Student_1.getCounter() + " objects oftype students");

    System.out.println("+++++++++++++++++++");

    clemens.setName("Clemens");
    tobias.setName("Tobias");

    clemens.setAge(19);
    tobias.setAge(55);

    clemens.setStudentId("cle1234");
    tobias.setStudentId("tob5678");


    System.out.println("Clemens and Tobias after initializing");
    System.out.println("+++++++++++++++++++");

    System.out.println(clemens.printStudentInfo());

    System.out.println("+++++++++++++++++++");

    System.out.println(tobias.printStudentInfo());

    System.out.println("+++++++++++++++++++");


    //Call by Value, not Call by reference = method recieves and changes only a copy of a
    int a = 23;
    System.out.println("A before = " + a);
    tobias.testParams(a);
    System.out.println("A after = " + a);

    System.out.println("+++++++++++++++++++");


    //here we pass the reference, there we can modify
    tobias.testParams2(tobias);
    System.out.println(tobias.printStudentInfo());

    System.out.println("+++++++++++++++++++");
    }
}