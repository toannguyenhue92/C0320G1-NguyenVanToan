package s03_class_and_object.exercise.fan;

public class Fan {
  public static final int SLOW = 1;
  public static final int MEDIUM = 2;
  public static final int FAST = 3;

  private int speed;
  private boolean on;
  private double radius;
  private String color;

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public boolean isOn() {
    return on;
  }

  public void setOn(boolean on) {
    this.on = on;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Fan() {
    this.speed = Fan.SLOW;
    this.on = false;
    this.radius = 5.0;
    this.color = "blue";
  }

  @Override
  public String toString() {
    if (this.isOn()) {
      return "fan is on, speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius;
    } else {
      return "fan is off, color: " + this.color + ", radius: " + this.radius;
    }
  }
}