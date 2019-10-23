class Expressions {
	public static void main(String[] args) {
		int x = 0;
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
		x = 3;
		System.out.println(true && ++x > 3.5);
		System.out.println(x);
		x = 3;
		System.out.println(false && ++x > 3.5);
		System.out.println(x);
		x = 3;
		System.out.println(true || x++ > 3.5);
		System.out.println(x);
		x = 3;
		System.out.println(false || x++ > 3.5);
		System.out.println(x);
		x = 3;
		System.out.println(x++ < 3.5 && ++x > 3.5);
		System.out.println(x);
		x = 3;
		System.out.println(++x < 3.5 || x++ < 3.5);
		System.out.println(x);
	}
}
