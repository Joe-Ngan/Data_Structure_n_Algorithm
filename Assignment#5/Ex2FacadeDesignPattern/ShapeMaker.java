package Ex2FacadeDesignPattern;

public class ShapeMaker implements Shape{
    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape square = new Square();

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

    @Override
    public void draw() {
        drawCircle();
        drawRectangle();
        drawSquare();
    }
}
