package at.mci.claudiasteiner.Klausur;

class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println( amount + " Paid with  Bank Transfer.");
    }
}