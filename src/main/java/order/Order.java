package order;

import deliverystrategy.Delivery;
import flowerstore.Item;
import paymentstrategy.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<Item> items = new ArrayList<Item>();
    Payment payment;
    Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }
}
