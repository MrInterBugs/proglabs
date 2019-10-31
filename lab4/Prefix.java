import java.util.Scanner;
import java.lang.Math.*;

public class Prefix {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean prefix;

    System.out.print("Please enter a sentance: ");
    String s1 = input.nextLine();

    System.out.print("Please enter another sentance to see if it is a prefix: ");
    String s2 = input.nextLine();

    int l = s2.length();
    int j = 0;

     for(int i=0; i<l; i++) {
      char c1 = s1.charAt(i);
      char c2 = s2.charAt(i);
      int comp = Character.compare(c1, c2);
      j = j + Math.abs(comp);
    }

    if(j==0) {
      System.out.println("String two is a prefix of string one.");
    } else {
      System.out.println("String two is not a prefix of string one.");
    }
  }
}
