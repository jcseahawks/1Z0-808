package tk.jcseahawks.ocja.day_thirteen.chaptertwo;
// Sun Apr 15 14:53:19 EDT 2018
interface I1 {
	default int doStuff() { return 1; }
}
interface I2 {
	default int doStuff() { return 2; }
}
public class MultiInt implements I1, I2 {
	public static void main(String [] args) {
		new MultiInt().go();
	}
	void go() {
		System.out.println(doStuff()); // class MultiInt inherits unrelated defaults for doStuff() from types I1 and I2
	}
	public int doStuff() {
		return 3;
	}
}
