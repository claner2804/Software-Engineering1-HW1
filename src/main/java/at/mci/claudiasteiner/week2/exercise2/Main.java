package at.mci.claudiasteiner.week2.exercise2;


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

        ExtendedTest testEx = new ExtendedTest();

        Test t = new Test();


        t.display();

        testEx.display();
    }
}

/*
The output is both times 23 because the display() method in the Test class is printing the value of the private int a field from the Test class itself. Here’s why this happens in detail:

Private Field Accessibility: In Java, private fields are not inherited by subclasses. Therefore, the private int a in Test is not accessible directly in ExtendedTest. ExtendedTest has a separate private String a field, but this does not affect the inherited display() method from Test.

Inheritance of display() Method: Since ExtendedTest inherits the display() method from Test, it uses the same code for the method as defined in Test. The display() method accesses this.a, which refers to the a field in the context of Test, not ExtendedTest.

Shadowing but Not Overriding: Although ExtendedTest declares its own field private String a = "hello world";, this field is completely separate from the int a field in Test. Therefore, when display() calls this.a (from Test), it still refers to Test's int a with a value of 23.

Output of display(): When display() is called on both instances (t.display() and testEx.display()), the method prints the value of int a from Test, which is 23.

Summary
Since display() in Test always references the private int a of Test, both t.display() and testEx.display() output 23. The private String a in ExtendedTest is a completely separate field and does not affect the display() method in any way.
 */
