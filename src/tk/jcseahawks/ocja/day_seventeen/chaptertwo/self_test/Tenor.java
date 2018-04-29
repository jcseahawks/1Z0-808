package tk.jcseahawks.ocja.day_seventeen.chaptertwo.self_test;
// Sun Apr 29 10:25:52 EDT 2018
public class Tenor extends Singer {
	public static String sing() {
		return "fa";
	}
	public static void main(String[] args) {
		Tenor t = new Tenor();
		Singer s = new Tenor();
		System.out.println(t.sing() + " " + s.sing());
	}
}
class Singer {
	public static String sing() {
		return "la";
	}
}
