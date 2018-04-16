package tk.jcseahawks.ocja.day_thirteen.chaptertwo.exam_watch;
// Sun Apr 15 18:19:02 EDT 2018
abstract class Animal { }
class Bear extends Animal { }
public class Test {
	public Animal go() {
		return new Bear(); // OK, Bear "is-a" Animal
	}
}
