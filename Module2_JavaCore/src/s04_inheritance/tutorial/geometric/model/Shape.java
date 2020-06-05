package s04_inheritance.tutorial.geometric.model;

public class Shape {
  private String color = "green";
  private boolean filled = false;

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return this.filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public Shape() {
  }

  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }

  @Override
  public String toString() {
    return "A shape of color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
  }
}
