package s05_abstract_and_interface.exercise.resizable;

import s04_inheritance.tutorial.geometric.model.Rectangle;

public class ResizableRectangle extends Rectangle implements Resizable {

    public ResizableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Before resize: " + this);
        System.out.println("Resize with percent = " + percent + "%");
        this.setWidth(this.getWidth() * (1 + percent / 100));
        this.setHeight(this.getHeight() * (1 + percent / 100));
        System.out.println("Before resize: " + this);
    }
}
