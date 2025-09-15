package org.lld.strategy.payment;

public interface PaymentStrategy {
    /**
     * Returns true if payment is successful, false otherwise
     */
    boolean processPayment(double amount);
}
