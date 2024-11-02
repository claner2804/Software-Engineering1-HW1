package at.mci.claudiasteiner.week2.exersice9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer a: ");
            a = scanner.nextInt();

            System.out.print("Enter an integer b: ");
            b = scanner.nextInt();

            if (b == 0){
                throw new ArithmeticException("can't divide by zero");
            }

            int result = a/b;
            System.out.println("the result is " + a + " / " + b + " = " + result);


        } catch (InputMismatchException e) {
            throw new NumberFormatException("what the fuck");
        }

    }
}
