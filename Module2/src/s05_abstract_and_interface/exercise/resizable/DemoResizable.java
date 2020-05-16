package s05_abstract_and_interface.exercise.resizable;

import java.util.Random;

public class DemoResizable {
    public static void main(String[] args) {
        Random random = new Random();

        ResizableCircle resizableCircle = new ResizableCircle(10.0);
        resizableCircle.resize(getRandomFrom1To99(random));

        ResizableRectangle resizableRectangle = new ResizableRectangle(10.0, 20.0);
        resizableRectangle.resize(getRandomFrom1To99(random));

        ResizableSquare resizableSquare = new ResizableSquare(10.0);
        resizableSquare.resize(getRandomFrom1To99(random));
    }

    public static int getRandomFrom1To99(Random random) {
        return random.nextInt(99) + 1;
    }
}
