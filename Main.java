import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[][] sajt = generateSimulation(100);
    String nline = "";
    for (int[] a : sajt) {
      for (int b : a) {
        nline += b + ",";
      }
      System.out.println(nline.substring(0,nline.length() - 1));
      nline = "";
    }

  }
  public static int[][] generateSimulation(int round) {
    int[][] nums = new int[round][6];
    Random rand = new Random();
    for (int i = 0; i <= round - 1; i++) {
      int[] numbers = {
        rand.nextInt(49) + 1,
        rand.nextInt(49) + 1,
        rand.nextInt(49) + 1,
        rand.nextInt(49) + 1,
        rand.nextInt(49) + 1,
        rand.nextInt(49) + 1
      };
      nums[i] = numbers;
    }
    return nums;
  }
}
