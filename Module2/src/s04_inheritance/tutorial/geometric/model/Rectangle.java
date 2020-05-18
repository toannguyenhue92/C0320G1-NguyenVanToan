package s04_inheritance.tutorial.geometric.model;

public class Rectangle extends Shape {
  private double width = 1.0;
  private double height = 1.0;

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return this.height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle(double width, double height, String color, boolean filled) {
    super(color, filled);
    this.width = width;
    this.height = height;
  }

  @Override
  public String toString() {
    return "A Rectangle with width = " + getWidth() + " and height = " + getHeight()
        + ", which is a subclass of " + super.toString();
  }

  public double getArea() {
    return getWidth() * getHeight();
  }

  public double getPerimeter() {
    return 2 * (getWidth() + getHeight());
  }
}
