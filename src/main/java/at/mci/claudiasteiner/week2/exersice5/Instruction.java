package at.mci.claudiasteiner.week2.exersice5;

/**
 * The type Instruction.
 */
public class Instruction {

    /**
     * Instruction 1.
     *
     * @throws Exception1 the exception 1
     */
    public static void instruction1() throws Exception1 {
        System.out.println("Instruction 1");
        throw new Exception1("Exception1 occurred in instruction1");
    }


    /**
     * Instruction 2.
     *
     * @throws Exception2 the exception 2
     */
    public static void instruction2() throws Exception2 {
        System.out.println("Instruction 2");
        throw new Exception2("Exception1 occurred in instruction2");
    }

    /**
     * Instruction 3.
     */
    public static void instruction3() {
        System.out.println("Instruction 3");
    }

    /**
     * Instruction 4.
     */
    public static void instruction4() {
        System.out.println("Instruction 4");
    }
}
