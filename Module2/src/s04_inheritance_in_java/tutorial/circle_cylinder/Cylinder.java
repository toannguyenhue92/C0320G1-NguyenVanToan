package s04_inheritance_in_java.tutorial.circle_cylinder;

public class Cylinder extends Circle {
  private double height = 1.0;

  public Cylinder() {

  }

  public Cylinder(double height) {
    super();
    this.height = height;
  }

  public Cylinder(double height, double radius) {
    super(radius);
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume() {
    return Math.PI * Math.pow(getRadius(), 2.0) * this.height;
  }

  public double getSurfaceArea() {
    return 2 * Math.PI * this.getRadius() * (this.getRadius() + this.height);
  }

  @Override
  public String toString() {
    return "A Cylinder with height = " + getHeight() + ", radius = " + this.getRadius()
        + ", which is a subclass of " + super.toString();
  }
}
