package tk.jcseahawks.ocja.day_eighteen.chaptertwo.self_test;
// Sun May  6 19:38:59 EDT 2018
interface MyInterface {
	default int doStuff() {
		return 42;
	}
}
public class IfaceTest implements MyInterface {
	public static void main(String[] args) {
		new IfaceTest().go();
	}
	void go() {
		// INSERT CODE HERE
		System.out.println("class: " + doStuff());
		// System.out.println("iface: " + super.doStuff());
		System.out.println("iface: " + MyInterface.super.doStuff());
		// System.out.println("iface: " + MyInterface.doStuff()); // non-static method doStuff() cannot be referenced from a static context
		// System.out.println("iface: " + super.MyInterface.doStuff());
	}
	public int doStuff() {
		return 43;
	}
}
