package paymentstrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {


    private PayPalPaymentStrategy payPal;
    @BeforeEach
    void setUp() {
        payPal = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(payPal.pay(34.4).equals("34.4 gryven are payed with PayPal"));
    }
}