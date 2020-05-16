package s04_inheritance.tutorial.geometric.classes;

public class Square extends Rectangle {

    public void setSide(double side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    public double getSide() {
        return this.getHeight();
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "A Square with side = " + getSide() + ", which is a subclass of " + super.toString();
    }
}
