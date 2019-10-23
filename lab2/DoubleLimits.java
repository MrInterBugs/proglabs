class DoubleLimits {
	public static void main(String[] args) {
		double i = 0;
		double x = 0.0;
		x = 0.2-0.1;
		System.out.println(x);
		x = 0.3-0.2;
		System.out.println(x); // Rounding error due to not being able to store 0.1 in binary easily.

		double h = 0.0; //this is the more accurate model. 
		for(i=1; i<50001; i++) {
			h = h + (1/i);
		}
		System.out.println(h);
		double j = 0.0;
		for(i=50000; i>0; i--) {
			j = j + (1/i);
		}
		System.out.println(j);
		System.out.println("Difference between the two is: " + (j-h));
	}
}
