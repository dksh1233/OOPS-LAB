package Lab7.Shape_Lab7;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 7.0);
        Shape circle = new Circle(3.5);

        rectangle.calculateArea();
        circle.calculateArea();
    }
}