import java.util.Scanner;

class TwoDiagonals {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Size of the square: ");
    int size = scanner.nextInt();
    
    String line;
   
    for (int i = 0; i < size; i++) {
      line = "";
      for (int j = size-1, z = 0; (j>=0&z<size); j--,z++) {
        if (i == j || i == z) {
          line += "x";
        } else {
          line += "o";
        }
      }
      System.out.println(line);
    }
  }
}
