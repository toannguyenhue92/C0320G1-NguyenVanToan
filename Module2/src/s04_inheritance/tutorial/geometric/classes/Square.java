package s04_inheritance.tutorial.geometric.classes;

public class Square extends Rectangle {

  public void setSide(double side) {
    setWidth(side);
    setHeight(side);
  }

  public double getSide() {
    return getWidth();
  }

  public Square() {
  }

  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  @Override
  public void setWidth(double width) {
    this.setSide(width);
  }

  @Override
  public void setHeight(double height) {
    this.setSide(height);
  }

  @Override
  public String toString() {
    return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
  }
}
