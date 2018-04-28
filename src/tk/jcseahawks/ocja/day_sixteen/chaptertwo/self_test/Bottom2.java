package tk.jcseahawks.ocja.day_sixteen.chaptertwo.self_test;
// Sat Apr 28 15:38:38 EDT 2018
class Top {
	public Top(String s) { System.out.print("B"); }
}
public class Bottom2 extends Top {
	public Bottom2(String s) { 
		// constructor Top must be called with proper arguments
		// super(s);
		System.out.print("D"); 
	}
	public static void main(String [] args) {
		new Bottom2("C");
		System.out.println(" ");
	}
}
