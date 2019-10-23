import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class Dessert {
	public static void main(String[] args) {
	int choice = 0;
	boolean truth;
	Scanner input = new Scanner(in);
        out.print("Would you like an apple or a banana (1 for apple, 2 for banana): ");
        choice = input.nextInt();
	truth = (choice==1);
        if(truth) {
            out.print("Would you like pastry or toffee? (1 for pastry, 2 for toffee): ");
			choice = input.nextInt();
			truth = (choice==1);
			if(truth) {
				out.println("You have made apple pie!");
			} else{
			out.println("you have made toffee apple!");
			}
        } else {
            out.print("Would you like milk or pancake batter? (1 for milk, 2 for pancake batter): ");
			choice = input.nextInt();
			truth = (choice==1);
			if(truth) {
				out.println("You have made banana milkshake!");
			} else{
			out.println("you have made banana pancakes!");
			}
		}
	}
}
