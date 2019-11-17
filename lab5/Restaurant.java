import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Restaurant {
		public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			list.add("Restruants");
			int exit = 0;
			int choice = 0;
			while(exit != 3) {
				System.out.println("1 to display restauarant list, 2 to add a restauarant, 3 to exit");
				Scanner scan = new Scanner(System.in);
				choice = scan.nextInt();
				if(choice == 1) {
					int len = list.size();
					for(int i = 0; i < len; i++) {
						System.out.println(list.get(i));
					}
				} else if(choice == 2) {
					System.out.println("Please enter");
					list.add(scan.nextLine());
					System.out.println("name: ");
					list.add(scan.nextLine());
					System.out.println("website: ");
					list.add(scan.nextLine());
					System.out.println("type of food: ");
					list.add(scan.nextLine());
				} else if(choice == 3) {
					System.out.println("Goodbye!");
					exit = 3;
				}
			}
		}
}
