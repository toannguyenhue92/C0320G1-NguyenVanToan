package s04_inheritance.tutorial.geometric.test;

import s04_inheritance.tutorial.geometric.model.Circle;

public class CircleTest {
  public static void main(String[] args) {
    Circle circle = new Circle();
    System.out.println(circle);

    circle = new Circle(3.5);
    System.out.println(circle);
  
    circle = new Circle("indigo", true, 5.0);
    System.out.println(circle);
  }
}