package at.mci.claudiasteiner.week2.exersice5;

/*
If an exception occurs in some_single_instruction_2, some_single_instruction_3 will not be executed.
If the exception is not caught, the program will terminate, and some_single_instruction_4 will not be executed.
If the exception is caught in a catch block, then some_single_instruction_4 will be executed after the catch block completes.
 */

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


    try {
        Instruction.instruction1();
        Instruction.instruction2();
        Instruction.instruction3();
    }
    catch (Exception1 ex1) {
        System.out.println("Exception1");
    }
    catch (Exception2 ex2) {
        System.out.println("Exception2");
    }
    Instruction.instruction4();


    }

}
