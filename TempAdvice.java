import java.io.Console;

public class TempAdvice {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("What temperature is it outside?");
    String temp = console.readLine();
    Integer tempNum = Integer.parseInt(temp);

    if (tempNum > 90) {
      System.out.println("Burning, wear a tank top.");
    } else if (tempNum < 90 && tempNum > 75) {
      System.out.println("Very nice, just wear what ever is comfortable!");
    } else if (tempNum < 75 && tempNum > 45) {
      System.out.println("Pretty chilly, throw on a jacket");
    } else {
      System.out.println("Too cold. Stay inside, have sex and protect the species");
    }
  }
}
