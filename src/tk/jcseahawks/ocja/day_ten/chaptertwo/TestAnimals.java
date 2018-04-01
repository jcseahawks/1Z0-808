package tk.jcseahawks.ocja.day_ten.chaptertwo;
// Sat Mar 31 15:17:27 EDT 2018
public class TestAnimals {
	public static void main(String [] args) {
		Animal a = new Animal();
		Animal b = new Horse(); // Animal ref, but a Horse object
		Animal c = new Horse();
		a.eat(); // Runs the Animal version of eat()
		b.eat(); // Runs the Horse version of eat()
	     // c.buck(); // cannot find symbol c.buck() on object type Animal
	}
}
