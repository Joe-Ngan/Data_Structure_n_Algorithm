package Ex1DecoratorPattern;

public class CarDecorator implements Car {
    protected Car car = null;
    protected String carType = "carType";

    public CarDecorator(Car car){
        this.car = car;
        car.assemble();
    }

    @Override
    public void assemble() {
        System.out.println("Adding features of "+ carType +".");
    }

}
