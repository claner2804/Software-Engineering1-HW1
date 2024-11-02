package at.mci.claudiasteiner.week2.exersice5;

public class Instruction {

    public static void instruction1() throws Exception1 {
        System.out.println("Instruction 1");
        throw new Exception1("Exception1 occurred in instruction1");
    }


    public static void instruction2() throws Exception2 {
        System.out.println("Instruction 2");
        throw new Exception2("Exception1 occurred in instruction2");
    }

    public static void instruction3() {
        System.out.println("Instruction 3");
    }

    public static void instruction4() {
        System.out.println("Instruction 4");
    }
}
