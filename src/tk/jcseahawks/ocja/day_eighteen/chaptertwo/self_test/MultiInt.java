package tk.jcseahawks.ocja.day_eighteen.chaptertwo.self_test;
// Sun May  6 18:42:45 EDT 2018
interface I1 {
	default int doStuff() {
		return 1;
	}
}
interface I2 {
	default int doStuff() {
		return 2;
	}
}
public class MultiInt implements I1, I2 {
	public static void main(String[] args) {
		new MultiInt().go();
	}
	void go() {
		System.out.println(doStuff());
	}
	int doStuff() { // attempting to assign weaker access privileges; was public
		return 3;
	}
}
