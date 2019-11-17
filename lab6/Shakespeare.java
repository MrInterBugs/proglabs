import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.io.FileWriter;

public class Shakespeare {
	public static void main(String[] args) throws FileNotFoundException, Exception{ //run providing the text file is present.

		int lines = 0; //Varible to count the amount of lines.
		File txt = new File("shakespeare.txt"); //Importing the text file that we are working with.
		Scanner scanner = new Scanner(txt); //Add the imported text file to Scanner utility.

		//Loop through the file counting each line untill it reaches the end.
		while(scanner.hasNextLine()) {
			scanner.nextLine();
			lines++;
		}

		System.out.println("jc.txt contains " + lines + " lines."); //output the number of lines.

		char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray(); //Creating an array with the alphabet inside. https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

		int[] amount = new int[27]; //Creating an array full of 27 blank spaces for counting the alphabet and puntuation marks.
		int len = 0; //The total length of the file which has been imported.
		int i = 0; //Used to keep track of point in the text file.
		int j = 0; //Used to keep track of point in alphabet.

		Scanner scan = new Scanner(txt); //Add the imported text file to Scanner utility.
		FileWriter fw = new FileWriter("Amount.txt"); //Creating a new file called amount to allow the javafx application to have the data. https://examples.javacodegeeks.com/core-java/io/filewriter/java-filewriter-example/

		String full = ""; //Blank string to import the .txt file into.

		//Loop through the text file adding each line to the varible full untill the end of the file is reached.
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			full = full + line;
		}

		full = full.replaceAll("\\s+",""); //Removing spaces from the imported text file. Found from https://stackoverflow.com/a/15633284.
		full = full.toLowerCase(); //Making the whole import one case so it is easier to work with.
		len = full.length(); //Calculate the total length of the string.

		//Loop through the full varible counting the amount a charicture appears for the whole alphabet.
		for(j=0; j<26; j++) {
			for(i=0; i<len; i++) {
				if(full.charAt(i) == (char)Array.get(alphabet,j)) {
					amount[j] = amount[j] + 1;
				}
			}
		}

		int sum = Arrays.stream(amount).sum(); //Total the size of the array.
		amount[26] = len - sum; //Calculate the puntuation marks by taking the full length minus the total array size.

		//Output the total amount of charictures in the text file.
		for(j=0; j<26; j++) {
			System.out.println("The amount of " + (char)Array.get(alphabet,j) + "'s are: " + Array.get(amount, j));
		}
		System.out.println("The amount of puntuation marks are & numbers are: " + Array.get(amount, 26)); //Output the amount of puntuation.

		//Writing the output of the system to a .txt file.
		fw.write(amount[0] + ""); //This stops there from being a blank line at the start or end of the file.
		int max = amount.length;
		for(j=1; j<max; j++) {
			fw.write("\n" + amount[j]);
		}
		fw.write("\n" + amount[26]); //I do not know why this line is needed, on my own version of java the punuation marks are added to the file through the loop.
		fw.close(); //closing and saving the open file.
	}
}
