package inputData;
import java.util.Scanner;

public class InputOfData {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String x;
    x = sc.next();
    System.out.println("You typed:" + x);
 
    sc.close();
  }
}
