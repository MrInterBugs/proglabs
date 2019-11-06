import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class RepeatedSubstring {
    public static int check_positions = 0;
    private static int len;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String s1 = input.nextLine();
        len = s1.length();

        for(int i=0; i<len; i++) {
            check_positions(s1, i);
        }

    }

    private static void check_positions(@NotNull String s1, int n) {
        boolean repeat = false;
        char first = s1.charAt(0);
        int i = 1;
        while(repeat == false) {
            char current =  s1.charAt(i);
            i++;
            if(first == current) {
                repeat = true;
                check_positions = i;
            }
        }
    }
}