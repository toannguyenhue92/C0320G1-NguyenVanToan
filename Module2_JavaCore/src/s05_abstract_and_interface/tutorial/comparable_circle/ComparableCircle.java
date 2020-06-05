package s05_abstract_and_interface.tutorial.comparable_circle;

import s04_inheritance.tutorial.geometric.model.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return Double.compare(this.getRadius(), o.getRadius());
    }
}
