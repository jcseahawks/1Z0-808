package tk.jcseahawks.ocja.day_thirteen.chaptertwo;
// Sun Apr 15 11:57:32 EDT 2018
public abstract class Ball implements Bounceable { // Keyword 'implements'
	public void moveIt() { } // Implements Moveable's method
	public void doSphericalThing() { } // Implements Spherical
}
class BeachBall extends Ball {
	public void bounce() {
		// interesting Beachball-specific bounce code
	}
	public void setBounceFactor(int bf) {
		// clever BeachBall-specific code for setting a bounce factor
	}
}
interface Bounceable extends Moveable, Spherical {
	void bounce();
	void setBounceFactor(int bf);
}
interface Moveable {
	void moveIt();
}
interface Spherical {
	void doSphericalThing();
}

