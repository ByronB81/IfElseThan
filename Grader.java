import java.io.Console;

public class Grader {
  public static void main(String[] args){
    Console console = System.console();

    System.out.println("What grade did you get on the test?");
    String grade = console.readLine();

    boolean A = grade.equals("A");
    boolean B = grade.equals("B");
    boolean C = grade.equals("C");
    boolean D = grade.equals("D");
    boolean F = grade.equals("F");

    if (A) {
      System.out.println("Excellent job, Smarty Pants!");
    } else if (B || C){
        System.out.println("Good job but I think you could do better");
    } else if (D){
        System.out.println("Ouch... daz gotta hurt");
    } else {
        System.out.println("Damn dawg! Good thing you pretty cuz you dumb as bricks lol");
    }

  }
}
