package s03_access_modifier.tutorial;

import java.util.Scanner;

public class Rectangle {
  double width;
  double height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return this.width * this.height;
  }

  public double getPerimeter() {
    return (this.width + this.height) * 2;
  }

  public String display() {
    return "Rectangle{" + "width=" + width + ", height=" + height + "}";
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the width: ");
    double width = scanner.nextDouble();
    System.out.print("Enter the height: ");
    double height = scanner.nextDouble();
    Rectangle rectangle = new Rectangle(width, height);
    System.out.println("Your Rectangle");
    System.out.println(rectangle.display());
    System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
    System.out.println("Area of the Rectangle: " + rectangle.getArea());
    scanner.close();
  }
}