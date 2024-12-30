// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
// mensagem explicativa, conforme exemplos.

package exercise;
import java.util.Scanner;


public class ReadValues {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    int x = sc.nextInt();

    System.out.print("Enter Secound Number: ");
    int y = sc.nextInt();
    
    int sum = x + y;
    
    System.out.println("SUM = " + sum);
    sc.close();
  }
}
