package tk.jcseahawks.ocja.day_seventeen.chaptertwo.self_test;
// Sun Apr 29 19:01:18 EDT 2018
public class Deer {
	public Deer() {
		System.out.print("Deer ");
	}
	public Deer(int age) {
		System.out.print("DeerAge ");
	}
	private boolean hasHorns() {
		return false;
	}
	public static void main(String [] args) {
		Deer deer = new ReinDeer(5);
		System.out.print(", " + deer.hasHorns());
	}
}
class ReinDeer extends Deer {
	public ReinDeer(int age) {
		System.out.print("ReinDeer");
	}
	public boolean hasHorns() {
		return true;
	} 
}
