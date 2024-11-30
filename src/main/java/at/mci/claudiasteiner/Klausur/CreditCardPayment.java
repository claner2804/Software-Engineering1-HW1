package at.mci.claudiasteiner.Klausur;

//Concrete Payment Implementations
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println( amount + " Paid with Credit Card.");
    }
}