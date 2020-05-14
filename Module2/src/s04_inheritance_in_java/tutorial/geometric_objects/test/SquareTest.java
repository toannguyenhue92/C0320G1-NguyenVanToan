package s04_inheritance_in_java.tutorial.geometric_objects.test;

import s04_inheritance_in_java.tutorial.geometric_objects.classes.Square;

public class SquareTest {
  public static void main(String[] args) {
    Square square = new Square();
    printSquareInfo(square);
    square = new Square(2.3);
    printSquareInfo(square);
    square = new Square(5.8, "yellow", true);
    printSquareInfo(square);
  }

  public static void printSquareInfo(Square square) {
    System.out.println(square);
    System.out.println("The area: " + square.getArea());
    System.out.println("The perimether: " + square.getPerimeter());
  }
}
