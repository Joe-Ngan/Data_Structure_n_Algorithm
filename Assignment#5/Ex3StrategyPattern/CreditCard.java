package Ex3StrategyPattern;

public class CreditCard implements PaymentStrategy{
    String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int n) {
        System.out.println("CreditCard : $" + n);
    }
}
