package at.mci.claudiasteiner.Klausur;

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with PayPal.");
    }
}