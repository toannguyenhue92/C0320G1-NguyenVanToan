package s05_abstract_and_interface.exercise.colorable;

import s04_inheritance.tutorial.geometric.classes.Circle;
import s04_inheritance.tutorial.geometric.classes.Rectangle;
import s04_inheritance.tutorial.geometric.classes.Shape;
import s04_inheritance.tutorial.geometric.classes.Square;

public class DemoColorable {
    public static void main(String[] args) {
        Shape[] shapes = sampleShapeArray();
        printShapeArray(shapes);
    }

    public static Shape[] sampleShapeArray() {
        Shape[] shapes = new Shape[5];
        shapes[0] = new ColorableSquare(2.3);
        shapes[1] = new Circle(2.5);
        shapes[2] = new Rectangle(2.0, 5.6);
        shapes[3] = new ColorableSquare(5.0);
        shapes[4] = new Square(3.1);
        return shapes;
    }

    public static void printShapeArray(Shape[] shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof ColorableSquare) {
                ColorableSquare colorableSquare = (ColorableSquare) shape;
                System.out.println("ColorableSquare: side = " + colorableSquare.getSide());
                System.out.println("Area: " + colorableSquare.getArea());
                System.out.println("Perimeter: " + colorableSquare.getPerimeter());
                colorableSquare.howToColor();
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println("Square: side = " + square.getSide());
                System.out.println("Area: " + square.getArea());
                System.out.println("Perimeter: " + square.getPerimeter());
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Rectangle: width = " + rectangle.getWidth()
                        + ", height = " + rectangle.getHeight());
                System.out.println("Area: " + rectangle.getArea());
                System.out.println("Perimeter: " + rectangle.getPerimeter());
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println("Circle: radius = " + circle.getRadius());
                System.out.println("Area: " + circle.getArea());
                System.out.println("Perimeter: " + circle.getPerimeter());
            }
            System.out.println();
        }
    }
}
