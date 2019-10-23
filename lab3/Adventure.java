import java.util.Scanner;

public class Adventure {
	public static void main(String[] args) {
		boolean finished = false, truth, key = false;
		Scanner input = new Scanner(System.in);
		while(finished==false) {
			System.out.println("There are two doors one left and one right.");
			System.out.print("Would you like to go through the left door or the right door.? (1 for the left door, 2 for the right door): ");
			truth = (input.nextInt() == 1);
			if(truth){
				System.out.println("There is a locked box.");
				if(key) {
					System.out.println("Congratulations, you have found gotten a lifes worth of tressure.");
					finished = true;
				} else {
				System.out.println("You do not have a key.");
				}
			} else {
				System.out.println("There is a small key on the floor. You take it and head back.");
				key = true;
			}
		}
	}
}
