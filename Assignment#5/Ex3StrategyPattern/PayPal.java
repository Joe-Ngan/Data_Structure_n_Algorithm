package Ex3StrategyPattern;

public class PayPal implements PaymentStrategy{
    String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(int n) {
        System.out.println("PayPal : $" + n);
    }
}
