class LineUp {
	public static int i = 0;

	private static Act[] acts = new Act[30];

	public static void addAct(Act n) {
		if (i < 30) {
			acts[i] = n;
			i++;
		} else {
			System.out.println("The festival is full!");
		}
	}

	public String toString() {
		String name = "";
		String output = "The Line up is:";
		for(int j = 0; j < 30; j++) {
			name = name + " " + acts[j].getName();
		}
		return name;
	}

	public void print() {
		System.out.println();
	}

	public int numberOfActs() {
		return acts.length;
	}

	public int totalMembers() {
		int total = 0;
		for(int x = 0; x < 30; x ++) {
			total = total + acts[0].getMembers();
		}
		return total;
	}

	public int totalKinds() {
		return 1;
	}
}
