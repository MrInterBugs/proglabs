import java.util.Scanner;
import static java.lang.System.out;

class Power {
	public static void main(String[] args) {
		double ans = 1.0;
		Scanner input = new Scanner(System.in);
		out.print("Please enter a floating point number: ");
		double a = input.nextDouble();
		out.print("Please enter a value for the integer: ");
		int n = input.nextInt();
		if(n>=0) {
			for(n=n; n>0; n--) {
				ans = ans * a;
			}
			out.println(ans);
		} else {
			n = Math.abs(n);
			for(n=n; n>0; n--) {
				ans = ans * a;
			}
			ans = 1/ans;
			out.println(ans);
		}
	}
}
