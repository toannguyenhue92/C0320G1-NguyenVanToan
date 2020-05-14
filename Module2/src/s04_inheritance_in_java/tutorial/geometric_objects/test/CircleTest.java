package s04_inheritance_in_java.tutorial.geometric_objects.test;

import s04_inheritance_in_java.tutorial.geometric_objects.classes.Circle;

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