import java.util.Scanner;

class EvenLength {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String words = input.next();
		if  (words.length() % 2 == 0) {
			System.out.println("The length is even");
		} else {
			System.out.println("The length is odd");
		}
	}
}
