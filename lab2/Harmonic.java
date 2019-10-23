class Harmonic {
	public static void main(String[] args) {
		double i = 0;
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
