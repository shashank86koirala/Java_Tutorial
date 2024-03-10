// Abstract class
abstract class Shape {
    // Fields
    String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method (to be implemented by subclasses)
    abstract double calculateArea();

    // Concrete method
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Concrete subclass
class Circle extends Shape {
    // Fields
    double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementation of the abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    // Fields
    double length;
    double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Main class
public class A {
    public static void main(String[] args) {
        // Creating objects of concrete subclasses
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Calling abstract and concrete methods
        circle.displayColor();
        System.out.println("Area of Circle: " + circle.calculateArea());

        rectangle.displayColor();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}