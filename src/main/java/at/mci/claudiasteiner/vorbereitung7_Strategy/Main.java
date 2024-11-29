package at.mci.claudiasteiner.vorbereitung7_Strategy;

public class Main {
    public static void main(String[] args) {


        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.executePayment(100);  // Output: Paid 100 using Credit Card.

        context = new PaymentContext(new PayPalPayment());
        context.executePayment(200);  // Output: Paid 200 using PayPal.



    }
}
