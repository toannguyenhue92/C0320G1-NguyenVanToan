package s03_class_and_object.exercise.fan;

public class DemoFan {
  public static void main(String[] args) {
    Fan firstFan = new Fan();
    firstFan.setSpeed(Fan.FAST);
    firstFan.setOn(true);
    firstFan.setRadius(10.0);
    firstFan.setColor("yellow");
    System.out.println("First fan: " + firstFan.toString());
    Fan secondFan = new Fan();
    secondFan.setSpeed(Fan.MEDIUM);
    secondFan.setColor("blue");
    System.out.println("Second fan: " + secondFan.toString());
  }
}