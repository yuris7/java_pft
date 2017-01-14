
public class Main {
  public static void main(String[] args) {
    Point2Variant p1 = new Point2Variant();
    Point2Variant p2 = new Point2Variant(1,1);
    System.out.println("Растстояние между точками "+p1+" и "+p2+" равно "+p1.length(p2));
  }
}
