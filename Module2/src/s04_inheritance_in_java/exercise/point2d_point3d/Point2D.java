package s04_inheritance_in_java.exercise.point2d_point3d;

public class Point2D {
  private float x = 0.0f;
  private float y = 0.0f;

  public Point2D() {
  }

  public Point2D(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float getX() {
    return this.x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return this.y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public void setXY(float x, float y) {
    this.x = x;
    this.y = y;
  }

  public float[] getXY() {
    float[] pair = new float[2];
    pair[0] = x;
    pair[1] = y;
    return pair;
  }

  @Override
  public String toString() {
    return String.format("(%f,%f)", x, y);
  }
}
