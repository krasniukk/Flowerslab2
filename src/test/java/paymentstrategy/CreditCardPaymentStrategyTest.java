package paymentstrategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {

    private CreditCardPaymentStrategy creditCard;
    @BeforeEach
    void setUp() {
        creditCard = new CreditCardPaymentStrategy();
    }

    @Test
    void pay() {
        assertTrue(creditCard.pay(34.4).equals("34.4 gryven are payed by credit card"));
    }
}