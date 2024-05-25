import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    try {
      int number = scanner.nextInt();
      System.out.println(number);
    } catch (InputMismatchException exception) {
      System.out.println(exception);
    } finally {
      System.out.println("End of program");
      scanner.close();
    }
  }
}
