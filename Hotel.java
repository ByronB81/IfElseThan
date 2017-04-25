import java.io.Console;

public class Hotel {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Please use lowercase");
    System.out.println("In what season are you booking your stay?");
    String season = console.readLine();

    System.out.println("On the weekend or weekday?");
    String dayOfWeek = console.readLine();

    boolean summer = season.equals("summer");
    boolean weekend = dayOfWeek.equals("weekend");

    if (summer && weekend) {
      System.out.println("Your stay is probably going to be expensive. It's peak travel season AND the weekend lol");
    } else if (summer || weekend) {
      System.out.println("Well kinda pricey... but you'll be fine");
    } else {
      System.out.println("meh... stop whining. It won't be THAT expensive");
    }
  }
}
