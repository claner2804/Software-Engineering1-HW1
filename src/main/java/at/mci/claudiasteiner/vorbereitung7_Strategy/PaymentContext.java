package at.mci.claudiasteiner.vorbereitung7_Strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    // Constructor injection of payment strategy
    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pay(amount); // Delegate payment to the strategy
    }
}
