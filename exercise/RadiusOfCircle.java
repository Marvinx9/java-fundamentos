package exercise;
import java.util.Scanner;

public class RadiusOfCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter circle radius: ");
    int radius = sc.nextInt();
    double pi = 3.14159, area;

    area = pi * radius * radius;

    System.out.println("Area of circle is: " + area);
    sc.close();
  }
}
