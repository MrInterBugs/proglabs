import java.util.Scanner;

class TwoDimArray {
  public static void main(String[] args) {
    // the dimensions of the array
    int height = 5, width = 2;

    // the array
    String[][] array = new String[height][width];
    
    // an auxiliary variable to print the array
    String line;
    
    // fill the 2-dim array
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        array[i][j] = " "+ i + j;
      }
    }
    
    // print the 2-dim array
    for (int i = 0; i < height; i++) {
      line = "";
      for (int j = 0; j < width; j++) {
        line += array[i][j];
      }
      System.out.println(line);
    }

   Scanner scan = new Scanner(System.in);
   System.out.println("Which colume would you like to check: ");
   int x = scan.nextInt();
   if(array[0][x] != null) {
	for(int i = 0; i < height; i++) {
		System.out.println(array[i][x]);
        }
   } else {
	System.out.println("Not in array");
   }
  }
}
