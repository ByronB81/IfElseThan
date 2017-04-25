import java.io.Console;

public class PotLuck {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.print("What is your name");
    String name = console.readLine();
    char letter = name.charAt(0);

    if (letter == 'A' || letter == 'a'){
      System.out.println("Bring Apples");
    } else if (letter == 'B' || letter == 'b'){
      System.out.println("Bring BBQ");
    } else if (letter == 'C' || letter == 'c'){
      System.out.println("Bring Candy");
    } else if (letter == 'D' || letter == 'd'){
      System.out.println("Bring Dumplings");
    } else if (letter == 'E' || letter == 'e'){
      System.out.println("Bring Eggplant");
    } else if (letter == 'F' || letter == 'f'){
      System.out.println("Bring Fish");
    } else if (letter == 'G' || letter == 'g'){
      System.out.println("Bring Ginger Snaps");
    } else if (letter == 'H' || letter == 'h'){
      System.out.println("Bring Horseradish");
    } else if (letter == 'I' || letter == 'i'){
      System.out.println("Bring Ice Cream");
    } else if (letter == 'J' || letter == 'j'){
      System.out.println("Bring Jello");
    } else if (letter == 'K' || letter == 'k'){
      System.out.println("Bring Kiwi");
    } else if (letter == 'L' || letter == 'l'){
      System.out.println("Bring Liquorice");
    } else if (letter == 'M' || letter == 'm'){
      System.out.println("Bring Mustard");
    } else if (letter == 'N' || letter == 'n'){
      System.out.println("Bring Noodles");
    } else if (letter == 'O' || letter == 'o'){
      System.out.println("Bring Onions");
    } else if (letter == 'P' || letter == 'p'){
      System.out.println("Bring Pickles");
    } else if (letter == 'Q' || letter == 'q'){
      System.out.println("Bring Quiche");
    } else if (letter == 'R' || letter == 'r'){
      System.out.println("Bring Rhubarb");
    } else if (letter == 'S' || letter == 's'){
      System.out.println("Bring Shish Kabobs");
    } else if (letter == 'T' || letter == 't'){
      System.out.println("Bring Truffles");
    } else if (letter == 'U' || letter == 'u'){
      System.out.println("Bring Upsidedown Cake");
    } else if (letter == 'V' || letter == 'v'){
      System.out.println("Bring Vegetables");
    } else if (letter == 'W' || letter == 'w'){
      System.out.println("Bring Watercress");
    } else if (letter == 'X' || letter == 'x'){
      System.out.println("Bring Chex Mix!");
    } else if (letter == 'Y' || letter == 'y'){
      System.out.println("Bring Yams");
    } else if (letter == 'Z' || letter == 'z'){
      System.out.println("Bring Ziti");
    }
    System.out.println("See ya Sunday!");
  }
}
