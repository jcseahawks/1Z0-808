package tk.jcseahawks.ocja.day_fifteen.chaptertwo;
// Tue Apr 17 19:54:50 EDT 2018
class Frog {
	int frogSize = 0;
	private static int frogCount = 0;
	public int getFrogSize() {
		return frogSize;
	}
	static int getCount() {
		return frogCount;
	}
	public Frog() {
		frogCount += 1;
	}
	public Frog(int s) {
		frogSize = s;
	}
	/* public static void main(String [] args) {
		Frog f = new Frog(25);
		System.out.println(f.getFrogSize());
	} */
}
class TestFrog {
	public static void main(String [] args) {
		new Frog();
		new Frog();
		new Frog();
		System.out.println("from static " + Frog.getCount());
		new Frog();
		new TestFrog().go();
		Frog f = new Frog();
		System.out.println("use ref var " + f.getCount()); // use reference var
	}
	void go() {
		System.out.println("from inst " + Frog.getCount());
	}
}
