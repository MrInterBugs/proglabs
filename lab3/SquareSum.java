import java.util.Scanner;

class SquareSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, n;
		int tot = 0;
		System.out.print("please enter a number: ");
		n = input.nextInt();
		for(i=n; i>=0; i--) {
			tot = tot + (i*i);
		}
		System.out.println(tot);
	}
}
