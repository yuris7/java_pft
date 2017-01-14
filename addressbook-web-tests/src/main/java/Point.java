import java.lang.Math;

public class Point {

  public static void main(String[] args) {
    System.out.println(distance(5,0));
  }

  public static double distance(int a, int b)
  {
    int dx = a - b;
    int dy = a - b;
    return Math.sqrt(dx * dx + dy * dy);
  }
}

