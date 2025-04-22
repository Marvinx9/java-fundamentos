package bitwise;

import java.util.Scanner;

public class BitWise {
  public static void main(String[] args) {
    int num1 = 89;
    int num2 = 60;

    System.out.println(num1 & num2);
    System.out.println(num1 | num2);
    System.out.println(num1 ^ num2);

    int mask = 32;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if((n & mask) != 0) {
      System.out.println("6th bit is true!"); //42 
    } else {
      System.out.println("6th bit is false!"); //89
    }
  }
}
