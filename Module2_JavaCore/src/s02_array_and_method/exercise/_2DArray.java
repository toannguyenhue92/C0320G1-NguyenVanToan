package s02_array_and_method.exercise;

public class _2DArray {
  public static void main(String[] args) {
    int[][] array = new int[10][10];
    System.out.println("Random 10x10 array of number:");
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        array[i][j] = (int) (Math.random() * 100);
        System.out.printf("%3d ", array[i][j]);
      }
      System.out.println();
    }
    printMaxValue(array);
  }

  public static void printMaxValue(int[][] a) {
    int maxValue = a[0][0];
    int rows = a.length;
    int cols = a[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (maxValue < a[i][j]) {
          maxValue = a[i][j];
        }
      }
    }
    System.out.println("The max value is: " + maxValue);
  }
}