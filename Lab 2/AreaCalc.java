public class AreaCalc {

    public double calculateArea(double length, double width) {
        return length * width;
    }


    public double calculateArea(double side) {
        return side * side;
    }


    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }


    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalc calculator = new AreaCalc();


        System.out.println("Area of Rectangle (length=5, width=4): " + calculator.calculateArea(5, 4));
        System.out.println("Area of Square (side=4): " + calculator.calculateArea(4));
        System.out.println("Area of Circle (radius=3): " + calculator.calculateArea(3,true));
        System.out.println("Area of Triangle (base=6, height=3): " + calculator.calculateArea(6, 3,true));
    }
}

