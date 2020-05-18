package s05_abstract_and_interface.exercise.resizable;

import s04_inheritance.tutorial.geometric.model.Square;

public class ResizableSquare extends Square implements Resizable {

    public ResizableSquare(double side) {
        super(side);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Before resize: " + this);
        System.out.println("Resize with percent = " + percent + "%");
        this.setSide(this.getSide() * (1 + percent / 100));
        System.out.println("Before resize: " + this);
    }
}
