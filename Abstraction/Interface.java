package Abstraction;

// Abstraction through an Interface
interface Shape {
    double getArea();  // Abstract method
    double getPerimeter();  // Abstract method
    default void show(){
        System.out.println("Default method");
    }
}

interface Diagram extends Shape{
default void show(){
    System.out.println("hai");
    Shape.super.show();
 }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

   
}

class Rectangle extends Circle {
    private double width;
    private double height;
    private double radius;

    public Rectangle(double r){
        // super(r);
        this(5d,6d);
    }

    public Rectangle(double width, double height) {
        super(width);
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

}

public class Interface {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        circle.show();

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
        rectangle.show();
    }
}
