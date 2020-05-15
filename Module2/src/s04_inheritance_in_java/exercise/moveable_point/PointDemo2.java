package s04_inheritance_in_java.exercise.moveable_point;

public class PointDemo2 {
  public static void main(String[] args) {
    MoveablePoint moveablePoint = new MoveablePoint(3f, 2.5f);
    System.out.println(moveablePoint);
    moveablePoint.move();
    System.out.println(moveablePoint);
    moveablePoint.move();
    System.out.println(moveablePoint);
    moveablePoint.move();
    System.out.println(moveablePoint);
  }
}
