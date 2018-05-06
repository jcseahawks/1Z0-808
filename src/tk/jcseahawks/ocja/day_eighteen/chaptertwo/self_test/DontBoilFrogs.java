package tk.jcseahawks.ocja.day_eighteen.chaptertwo.self_test;
// Sun May  6 18:15:52 EDT 2018
interface FrogBoilable {
	static int getCtoF( int cTemp) {
		return (cTemp * 9 / 5) + 32;
	}
	default String hop() {
		return "hopping ";
	}
}
public class DontBoilFrogs implements FrogBoilable {
	public static void main(String[] args) {
		new DontBoilFrogs().go();
	}
	void go() {
		System.out.println(hop());
		// System.out.println(getCtoF(100));
		System.out.println(FrogBoilable.getCtoF(100));
		DontBoilFrogs dbf = new DontBoilFrogs();
		// System.out.println(dbf.getCtoF(100));
	}
}
