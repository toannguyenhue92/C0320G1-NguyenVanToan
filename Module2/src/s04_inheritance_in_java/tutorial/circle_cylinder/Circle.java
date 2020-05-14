package s04_inheritance_in_java.tutorial.circle_cylinder;

public class Circle {
  private double radius = 1.0;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
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
    return "A Circle with radius = " + getRadius();
  }
}
