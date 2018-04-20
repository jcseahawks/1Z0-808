package tk.jcseahawks.ocja.day_fifteen.chaptertwo;
// Tue Apr 17 20:44:50 EDT 2018
interface FrogBoilable {
	static int getCtoF(int cTemp) {
		return (cTemp * 9 / 5) + 32;
	}
	default String hop() { return "hoping" ; }
}
public class DontBoilFrogs implements FrogBoilable {
	public static void main(String [] args) {
		new DontBoilFrogs().go();
	}
	void go() {
		System.out.println(hop());
		// System.out.println(getCtoF(100)); // static interface method can't be inhereted
		System.out.println(FrogBoilable.getCtoF(100));
		DontBoilFrogs dbf = new DontBoilFrogs();
		// System.out.println(dbf.getCtoF(100)); // trying to access supertype static method
        }
}
