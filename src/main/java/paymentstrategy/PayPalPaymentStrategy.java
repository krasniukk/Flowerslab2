package paymentstrategy;

public class PayPalPaymentStrategy extends Payment{
    @Override
    public String pay(double price) {
        System.out.println(Double.toString(price) + " gryven are payed with PayPal");
        return Double.toString(price) + " gryven are payed with PayPal";
    }

}
