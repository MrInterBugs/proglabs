class IntLimits {
	public static void main(String[] args) {
		int x = 2147483646;
		int y = 0;
		y = x + 3;
		System.out.println(x);
		System.out.println(y);
		x = -2147483646;
		y = x - 5;
		System.out.println(x);
		System.out.println(y); //smallest is -2,147,483,648
		// Long range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	}
}
