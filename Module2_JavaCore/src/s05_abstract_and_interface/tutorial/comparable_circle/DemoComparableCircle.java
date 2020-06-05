package s05_abstract_and_interface.tutorial.comparable_circle;

import java.util.Arrays;

public class DemoComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[5];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle(2);
        circles[2] = new ComparableCircle(3.5);
        circles[3] = new ComparableCircle(1.5);
        circles[4] = new ComparableCircle(0.5);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
