import java.util.Scanner;

public class Matryoshka {
	public static void main(String[] args) {
		boolean finished = false, truth, key = false;
		Scanner input = new Scanner(System.in);
		while(finished==false) {
			System.out.println("There is  a Russian doll on the table. You open it and find two more dolls, one blue one green.");
			System.out.print("Would you like to open the blue doll or green doll? (1 for blue, 2 for green): ");
			truth = (input.nextInt() == 1);
			if(truth){
				System.out.println("The doll contains a small, locked box.");
				if(key) {
					System.out.println("Congratulations, you have found the golden ticket.");
					finished = true;
				} else {
				System.out.println("You do not have a key.");
				}
			} else {
				System.out.println("The doll contains a small key. You take the key.");
				key = true;
			}
		}
	}
}
