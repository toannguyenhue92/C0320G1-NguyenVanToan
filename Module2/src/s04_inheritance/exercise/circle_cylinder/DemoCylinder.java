package s04_inheritance.exercise.circle_cylinder;

public class DemoCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1.0, 1.0);
        printCylinderInfo(cylinder);
    }

    public static void printCylinderInfo(Cylinder cylinder) {
        System.out.println(cylinder);
        System.out.println("The area: " + cylinder.getArea());
        System.out.println("The perimeter: " + cylinder.getPerimeter());
    }
}
