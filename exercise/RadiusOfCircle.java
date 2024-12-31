package exercise;
import java.util.Locale;
import java.util.Scanner;

public class RadiusOfCircle {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter circle radius: ");
    int radius = sc.nextInt();
    double pi = 3.14159, area;

    area = pi * radius * radius;

    System.out.printf("Area of circle is: %.4f%n", area);
    sc.close();
  }
}
