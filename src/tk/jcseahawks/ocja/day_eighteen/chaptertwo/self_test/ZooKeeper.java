package tk.jcseahawks.ocja.day_eighteen.chaptertwo.self_test;
// Sun May  6 17:22:57 EDT 2018
class Mammal {
	String name = "furry ";
	String makeNoise() {
		return "generic noise";
	}
}
class Zebra extends Mammal {
	String name = "stripes ";
	String makeNoise() {
		return "bray";
	}
}
public class ZooKeeper {
	public static void main(String[] args) {
		new ZooKeeper().go();
	}
	void go() {
		Mammal m = new Zebra();
		System.out.println(m.name + m.makeNoise());
	}
}
