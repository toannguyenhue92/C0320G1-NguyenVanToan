package s04_inheritance_in_java.exercise.point2d_point3d;

public class Point3D extends Point2D {
  private float z = 0.0f;

  public Point3D() {
  }

  public Point3D(float x, float y, float z) {
    super(x, y);
    this.z = z;
  }

  public float getZ() {
    return this.z;
  }

  public void setZ(float z) {
    this.z = z;
  }

  public void setXYZ(float x, float y, float z) {
    setXY(x, y);
    this.z = z;
  }

  public float[] getXYZ() {
    float[] point = new float[3];
    point[0] = getX();
    point[1] = getY();
    point[2] = z;
    return point;
  }

  @Override
  public String toString() {
    return String.format("(%f,%f,%f)", getX(), getY(), z);
  }
}
