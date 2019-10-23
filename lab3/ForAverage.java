import java.util.Scanner;

class ForAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a number to be averaged: ");
		int n = input.nextInt();
		double average = 0.0;
		for(int i=n; i>0; i--) {
			average = average + i;
		}
		average = average/n;
		System.out.println("The average is: " + average);
	}
}
