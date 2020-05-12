package s03_class_and_object.exercise.stopwatch;

import java.util.Date;

public class StopWatch {
  private long startTime;
  private long endTime;

  public StopWatch() {
    this.startTime = new Date().getTime();
  }

  public void start() {
    this.startTime = new Date().getTime();
  }

  public void stop() {
    this.endTime = new Date().getTime();
  }

  public long getElapsedTime() {
    if (this.endTime == 0) {
      this.endTime = new Date().getTime();
    }
    return endTime - startTime;
  }
}