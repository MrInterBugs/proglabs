class Act {

	private static int num_members;
        private static String name;
        private static String kind;
        private static String stage;

	public String toString() {
		return ("The preforming act is called " + getName() + " they are a " + getKind() + " There will be " + getMembers() + " members on stage and this will be preformed at " + getStage() + ".\n");
	}

	public Act(int n, String na, String k, String s) {
		num_members = n;
		name = na;
		kind = k;
		stage = s;
	}

	public Act(int n, String na, String k) {
		num_members = n;
		name = na;
		kind = k;
		stage = null;
	}

	public int getMembers() {
		return this.num_members;
	}
	public String getName() {
		return this.name;
	}
	public String getKind() {
		return this.kind;
	}
	public String getStage() {
		return this.stage;
	}

	public static void setMembers(int n) {
		num_members = n;
	}
	public static void setName(String name) {
		name = name;
	}
	public static void setKind(String k) {
		kind = k;
	}
	public static void setStage(String s) {
		stage = s;
	}
}
