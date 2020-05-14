package s04_inheritance_in_java.tutorial.geometric_objects.test;

import s04_inheritance_in_java.tutorial.geometric_objects.classes.Shape;

public class ShapeTest {
  public static void main(String[] args) {
    Shape shape = new Shape();
    System.out.println(shape);
    shape = new Shape("red", true);
    System.out.println(shape);
  }
}