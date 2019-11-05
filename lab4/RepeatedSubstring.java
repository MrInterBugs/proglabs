import java.util.Scanner;

public class RepeatedSubstring {
    public static int i = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String s1 = input.nextLine();
        int len = s1.length();

        for(int i=0; i<len; i++) {
            check_positions(s1, i);
        }

    }

    static void check_positions(String s1, int n) {
        Boolean repeat = false;
        int len = s1.length();
        char first = s1.charAt(0);

        for(i = 1; i<len; i++) {
            while(repeat = false) {
                if(first == s1.charAt(i)) {
                    repeat = true;
                }
            }
        }
    }
}