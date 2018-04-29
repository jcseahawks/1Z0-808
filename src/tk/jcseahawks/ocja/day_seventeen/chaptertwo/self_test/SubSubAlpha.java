package tk.jcseahawks.ocja.day_seventeen.chaptertwo.self_test;
// Sun Apr 29 10:56:52 EDT 2018
class Alpha {
	static String s = " ";
	protected Alpha() {
		s += "alpha "; 
	}
}
class SubAlpha extends Alpha {
	private SubAlpha() {
		s += "sub ";
	}
}
public class SubSubAlpha extends Alpha { // watch extends Alpha not SubAlpha
	private SubSubAlpha() { 
		s += "subsub ";
	}
	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);
	}
}
