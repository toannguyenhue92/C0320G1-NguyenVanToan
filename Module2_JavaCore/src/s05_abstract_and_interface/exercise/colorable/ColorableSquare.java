package s05_abstract_and_interface.exercise.colorable;

import s04_inheritance.tutorial.geometric.model.Square;

public class ColorableSquare extends Square implements Colorable {

    public ColorableSquare(double side) {
        super(side);
    }

    @Override
    public void howToColor() {
        System.out.println("How to color: Color all four sides!");
    }

    @Override
    public String toString() {
        return "A ColorableSquare with side = " + getSide() + ", which is a subclass of "
                + super.toString() + ", implements interface Colorable";
    }
}
