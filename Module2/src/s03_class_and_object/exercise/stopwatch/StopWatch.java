package s03_class_and_object.exercise.stopwatch;

public class StopWatch {
  private long startTime;
  private long endTime;

  public StopWatch() {
    this.startTime = System.currentTimeMillis();
  }

  public void start() {
    this.startTime = System.currentTimeMillis();
  }

  public void stop() {
    this.endTime = System.currentTimeMillis();
  }

  public long getElapsedTime() {
    if (this.endTime == 0) {
      this.endTime = System.currentTimeMillis();
    }
    return endTime - startTime;
  }
}
