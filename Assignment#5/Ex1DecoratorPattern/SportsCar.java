package Ex1DecoratorPattern;

public class SportsCar extends CarDecorator{
   public SportsCar(Car car){
       super(car);
       this.carType = "SportsCar";
   }
}
