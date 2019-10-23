import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Fiction {
	public static void main(String[] args) throws FileNotFoundException {
		String choice = "1";
		String testval;
		File txt = new File("instructions.txt");
		Scanner scan = new Scanner(txt);
		Scanner input = new Scanner(System.in);
		 while(scan.hasNextLine()) {
             String line = scan.nextLine();
             String[] data = line.split(";");
             testval = data[0];
             int arrayLength = data.length;
             while(testval.equals(choice)) {
            	 System.out.print(data[1]);
            	 for (int i=2; i<arrayLength; i+=2) {
            		 int j = i + 1;
            		 System.out.print(" For" + data[i] + " input " + data[j] + " ");
            	 }
            	 System.out.print(": ");
            	 choice = input.next();
                 }
		}
	}
}

