package s04_inheritance_in_java.tutorial.geometric_objects.classes;

public class Circle extends Shape {

  private double radius = 1.0;

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public Circle() {
  }

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(String color, boolean filled, double radius) {
    super(color, filled);
    this.radius = radius;
  }

  public double getArea() {
    return Math.PI * Math.pow(getRadius(), 2.0);
  }

  public double getPerimeter() {
    return 2 * Math.PI * getRadius();
  }

  @Override
  public String toString() {
    return "A Circle with radius = " + getRadius() + " , which is a subclass of "
        + super.toString();
  }
}
