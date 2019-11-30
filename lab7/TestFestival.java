public class TestFestival {
	public static void main(String[] args) {
		Act myAct1 = new Act(1, "Russel Howard", "Comedian", "O2 Arena");
		Act myAct2 = new Act(10, "Dancing Team", "Dance", "O2 Academy Brixton");
		Act myAct3 = new Act(1, "The Eden Project", "Music", "02 Academy Shepherds Bush");

		LineUp myFestival = new LineUp();

		myFestival.addAct(myAct1);
		myFestival.addAct(myAct2);
		myFestival.addAct(myAct3);

		System.out.println(myFestival);
		int i = 0;

		while(i < 28) {
			LineUp.addAct(myAct1);
			i++;
		}

		System.out.println(myFestival.numberOfActs());
		System.out.println(myFestival.totalMembers());
	}
}
