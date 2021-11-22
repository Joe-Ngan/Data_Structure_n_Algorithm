package Ex1DecoratorPattern;

public class BasicCar implements Car {
    String carType = "Basic Car";

    public String getCarType() {
        return carType;
    }


    @Override
    public void assemble() {
        System.out.println("Basic Car.");
    }
}
