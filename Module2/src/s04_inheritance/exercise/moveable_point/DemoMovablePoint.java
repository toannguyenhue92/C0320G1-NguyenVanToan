package s04_inheritance.exercise.moveable_point;

public class DemoMovablePoint {
  public static void main(String[] args) {
    MovablePoint movablePoint = new MovablePoint(3f, 2.5f);
    System.out.println(movablePoint);
    movablePoint.move();
    System.out.println(movablePoint);
    movablePoint.move();
    System.out.println(movablePoint);
    movablePoint.move();
    System.out.println(movablePoint);
  }
}
