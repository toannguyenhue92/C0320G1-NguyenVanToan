package s04_inheritance.exercise.circle_cylinder;

import s04_inheritance.tutorial.geometric.classes.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2.0) * height;
    }

    public double getSurfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    @Override
    public String toString() {
        return "A Cylinder with height = " + getHeight() + ", radius = " + getRadius()
                + ", which is a subclass of " + super.toString();
    }
}
