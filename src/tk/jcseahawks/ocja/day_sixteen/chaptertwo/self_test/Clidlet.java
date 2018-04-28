package tk.jcseahawks.ocja.day_sixteen.chaptertwo.self_test;
// Sat Apr 28 16:04:43 EDT 2018
class Clidder {
	private final void flipper() { System.out.println("Clidder"); }
}
public class Clidlet extends Clidder {
	public final void flipper() { System.out.println("Clidlet"); }
	public static void main(String [] args) {
		new Clidlet().flipper();
	}
}
