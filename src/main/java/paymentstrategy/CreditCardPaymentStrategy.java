package paymentstrategy;

public class CreditCardPaymentStrategy extends Payment{
    @Override
    public String pay(double price) {
        System.out.println(Double.toString(price) + " gryven are payed by credit card");
        return Double.toString(price) + " gryven are payed by credit card";
    }
}
