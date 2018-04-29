package tk.jcseahawks.ocja.day_seventeen.chaptertwo.self_test;
// Sun Apr 29 08:34:44 EDT 2018
class Dog {
	public void bark() { System.out.print("woof "); }
}
class Hound extends Dog {
	public void sniff() { System.out.print("sniff " ); }
	public void bark() { System.out.print("howl "); }
}
public class DogShow {
	public static void main(String[] args) {
		new DogShow().go();
	}
	void go() {
		new Hound().bark();
		((Dog) new Hound()).bark();
		// ((Dog) new Hound()).sniff(); // cannot find symbol
	}
}
