import java.io.Console;

public class DoubleDigit {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Pick a number");
    String strNum = console.readLine();
    Integer num = Integer.parseInt(strNum);

    if(num >= 10 && num <= 99) {
      System.out.println("Ah shee-it, dat number is a double digit. You is Smart. You is kind!");
    } else {
      System.out.println("Naw dawg, we only looking for double digit numbers up in here");
    }


  }
}
