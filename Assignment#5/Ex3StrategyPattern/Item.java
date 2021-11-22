package Ex3StrategyPattern;

public class Item {
    private String id;
    private int price;

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Item(String id, int price){
        this.id = id;
        this.price = price;
    }

}
