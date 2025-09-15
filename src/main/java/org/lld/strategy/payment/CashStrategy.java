package org.lld.strategy.payment;

public class CashStrategy implements PaymentStrategy{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing Cash payment of amount: " + amount);
        // Simulate payment processing logic
        return true; // Assume payment is always successful for this example
    }
}