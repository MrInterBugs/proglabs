import java.util.Scanner;

class FillArrayC {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int arrayLength = scanner.nextInt();

    int [] numbers = new int[arrayLength];

    for (int i = 0; i < arrayLength; i = i + 1) {
     int j = i % 2;
     if(j == 0) {
	numbers[i] = 1;
      } else {
      numbers[i] = 0;
      }
    }

    for (int i = 0; i < arrayLength; i = i + 1) {
      System.out.println("numbers[" + i + "] = " + numbers[i]);
    }
  }
}

