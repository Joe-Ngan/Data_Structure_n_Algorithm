package Ex1DecoratorPattern;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car){
        super(car);
        this.carType = "LuxuryCar";
    }
}
