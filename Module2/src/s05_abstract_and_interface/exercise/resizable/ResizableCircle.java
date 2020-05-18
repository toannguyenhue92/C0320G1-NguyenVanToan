package s05_abstract_and_interface.exercise.resizable;

import s04_inheritance.tutorial.geometric.model.Circle;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Before resize: " + this);
        System.out.println("Resize with percent = " + percent + "%");
        this.setRadius(this.getRadius() * percent / 100);
        System.out.println("Before resize: " + this);
    }
}
