package s04_inheritance.tutorial.geometric.test;

import s04_inheritance.tutorial.geometric.model.Shape;

public class ShapeTest {
  public static void main(String[] args) {
    Shape shape = new Shape();
    System.out.println(shape);
    shape = new Shape("red", true);
    System.out.println(shape);
  }
}