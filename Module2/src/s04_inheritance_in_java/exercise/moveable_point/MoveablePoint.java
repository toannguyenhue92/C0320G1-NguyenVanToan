package s04_inheritance_in_java.exercise.moveable_point;

public class MoveablePoint extends Point {
  private float xSpeed = 0.0f;
  private float ySpeed = 0.0f;

  public float getXSpeed() {
    return this.xSpeed;
  }

  public void setXSpeed(float xSpeed) {
    this.xSpeed = xSpeed;
  }

  public float getYSpeed() {
    return this.ySpeed;
  }

  public void setYSpeed(float ySpeed) {
    this.ySpeed = ySpeed;
  }


  public MoveablePoint() {
  }

  public MoveablePoint(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public MoveablePoint(float xSpeed, float ySpeed, float x, float y) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public void setSpeed(float xSpeed, float ySpeed) {
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public float[] getSpeed() {
    float[] speed = {xSpeed, ySpeed};
    return speed;
  }

  @Override
  public String toString() {
    return String.format("(%f, %f), speed=(%f, %f)", getX(), getY(), xSpeed, ySpeed);
  }

  public MoveablePoint move() {
    float xNew = getX() + xSpeed;
    setX(xNew);
    float yNew = getY() + ySpeed;
    setY(yNew);
    return this;
  }
}
