package tk.jcseahawks.ocja.day_ten.chaptertwo;
// Sat Mar 31 06:15:29 EDT 2018
public class Horse extends Animal {
	private Halter myHalter = new Halter();
	public void printYourself() {
		// Take advantage of Animal code, then add some more
		super.printYourself(); // Invoke the superclass
		                       // (Animal) code
				       // Then do Horse-specific
				       // print work here
	}
	public void tie(LeadRope rope) {
		myHalter.tie(rope); //Delegate tie behavior to the 
		                    // Halter object
	}
	public void eat() {
	// private void eat() { // attempting to assign weaker access privileges
		System.out.println("Horse eating hay, oats, " + "and horse treats");
	}
	public void buck() {
	}
}
