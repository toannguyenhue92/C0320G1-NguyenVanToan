package s03_class_and_object.exercise;

import java.util.Scanner;

public class QuadraticEquation {
  private double a;
  private double b;
  private double c;

  QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA() {
    return this.a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return this.b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public double getC() {
    return this.c;
  }

  public void setC(double c) {
    this.c = c;
  }

  public double getDiscriminant() {
    return Math.pow(b, 2.0) - 4 * a * c;
  }

  public Double getRoot1() {
    if (this.getDiscriminant() >= 0 && a != 0) {
      return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
    }
    return null;
  }

  public Double getRoot2() {
    if (this.getDiscriminant() >= 0 && a != 0) {
      return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
    }
    return null;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a: ");
    double a = scanner.nextDouble();
    System.out.print("Enter b: ");
    double b = scanner.nextDouble();
    System.out.print("Enter c: ");
    double c = scanner.nextDouble();
    QuadraticEquation equation = new QuadraticEquation(a, b, c);
    if (equation.getDiscriminant() > 0) {
      System.out.printf("The equation has two roots: %.5f and %.5f.\n", equation.getRoot1(), equation.getRoot2());
    } else if (equation.getDiscriminant() == 0) {
      System.out.printf("The equation has one root: %.5f.\n", equation.getRoot1());
    } else {
      System.out.println("The equation has no real roots.");
    }
    scanner.close();
  }
}