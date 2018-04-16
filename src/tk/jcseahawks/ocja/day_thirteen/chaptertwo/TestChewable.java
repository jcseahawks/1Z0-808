package tk.jcseahawks.ocja.day_thirteen.chaptertwo;
// Sun Apr 15 18:12:23 EDT 2018
interface Chewable { }
class Gum implements Chewable { }
public class TestChewable {
	public Chewable getChewable() {
		return new Gum(); // Return interface implementer
	}
}
