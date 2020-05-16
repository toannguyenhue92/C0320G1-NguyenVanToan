package s05_abstract_and_interface.tutorial.circle_comparator;

import java.util.Comparator;

import s04_inheritance.tutorial.geometric.classes.Circle;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 2;
        else if (c1.getRadius() < c2.getRadius()) return -2;
        else return 0;
    }

}
