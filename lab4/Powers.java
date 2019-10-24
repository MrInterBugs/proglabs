import java.util.Scanner;

public class Powers {
	public static void main(String[] args) {
		System.out.print("Please enter a number to see if it makes a perfect square or cube: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		perfectSquare(n);
		perfectCube(n);
	}
	static void perfectSquare(int n) {
		for(int i=0; i<n; i++) {
			if(n == i*i) {
				System.out.println("Perfect Square.");
			}
		}
	}
	static void perfectCube(int n) {
		for(int i=0; i<n; i++) {
                        if(n == i*i*i) {
                                System.out.println("Perfect Cube.");
			}
                }
	}
}
