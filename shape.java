abstract class Quadrilateral {
    protected double x1, y1, x2, y2, x3, y3, x4, y4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public void displayCoordinates() {
        System.out.println("Coordinates are (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + "), (" + x4 + "," + y4 + ")");
    }

    public abstract double area();
}

class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double height) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.height = height;
    }

    @Override
    public double area() {
        return ((x1 + x2) / 2.0) * height;
    }
}

class Rectangle extends Quadrilateral {
    public Rectangle(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y1, x2, y2, x1, y2);
    }

    @Override
    public double area() {
        return (x2 - x1) * (y3 - y1);
    }
}

class Square extends Quadrilateral {
    public Square(double side) {
        super(0.0d , 0.0d , side , 0.0d , side , side , 0.0d , side);
    }

    @Override
    public double area() {
        return Math.pow((x2 - x1), 2);
    }
}

public class shape{
    public static void main(String[] args) {

        Trapezoid trapezoid = new Trapezoid(10.0d , 10.0d , 20.0d , 10.0d , 30.0d , 20.0d , 0.0d , 20.0d , 10.0d);
        trapezoid.displayCoordinates();
        System.out.println("Area of the trapezoid is: " + trapezoid.area());

        Rectangle rectangle = new Rectangle(10.0d , 10.0d , 30.0d , 20.0d);
        rectangle.displayCoordinates();
        System.out.println("Area of the rectangle is: " + rectangle.area());

        Square square = new Square(20.0d);
        square.displayCoordinates();
        System.out.println("Area of the square is: " + square.area());
        
    }
}
