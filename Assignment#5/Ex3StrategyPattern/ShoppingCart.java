package Ex3StrategyPattern;

import java.util.*;

public class ShoppingCart {
    List<Item> list;
    int sum;
    public ShoppingCart(){
        this.list = new ArrayList<>();
    }

    public void addItem(Item item){
        list.add(item);
        sum += item.getPrice();
    }

    public void removeItem(Item item){
        sum -= item.getPrice();
        list.remove(item);
    }

    public int calculateTotal(){
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        calculateTotal();
        paymentStrategy.pay(sum);
    }

    public void print() {
        for(Item item : list) {
            System.out.println(item.getId() + " " +Integer.toString(item.getPrice()));
        }
    }
}
