package s04_inheritance.tutorial.geometric.test;

import s04_inheritance.tutorial.geometric.classes.Rectangle;

public class RectangleTest {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    printRectangleInfo(rectangle);
    rectangle = new Rectangle(2.0, 3.5);
    printRectangleInfo(rectangle);
    rectangle = new Rectangle(2.5, 6.9, "gray", true);
    printRectangleInfo(rectangle);
  }

  public static void printRectangleInfo(Rectangle rectangle) {
    System.out.println(rectangle);
    System.out.println("The area: " + rectangle.getArea());
    System.out.println("The perimether: " + rectangle.getPerimeter());
  }
}
