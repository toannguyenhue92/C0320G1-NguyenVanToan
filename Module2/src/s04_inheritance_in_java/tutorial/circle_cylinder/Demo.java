package s04_inheritance_in_java.tutorial.circle_cylinder;

public class Demo {
  public static void main(String[] args) {
    Cylinder cylinder = new Cylinder(5.0, 2.0);
    printCylinderInfo(cylinder);
  }

  public static void printCylinderInfo(Cylinder cylinder) {
    System.out.println(cylinder);
    System.out.println("The area: " + cylinder.getArea());
    System.out.println("The perimether: " + cylinder.getPerimeter());
  }
}
