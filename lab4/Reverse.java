import java.util.Scanner;

public class Reverse {
  public static void main(String[] args) {
    System.out.print("Please enter a number to its palindromes: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    palindrome(n);
  }

  static void palindrome(int n) {
    int x = 0;
    int y = 0;
    int input = n;
    while(n>0) {
      y = (n%10);
      x = (x*10) + y;
      n = n/10;
    }
    if(x == input) {
      System.out.println("it is a palindrome.");
    } else {
      System.out.println("it is not a palindrome.");
    }
  }
}
