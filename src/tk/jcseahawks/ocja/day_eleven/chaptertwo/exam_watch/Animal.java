package tk.jcseahawks.ocja.day_eleven.chaptertwo.exam_watch;
// Sun Apr  1 09:44:14 EDT 2018
class Animal {
	public void eat() throws Exception {
		// throws an Exception
	}
}
class Dog2 extends Animal {
	public void eat() {
		/* no Exceptions */
	}
	public static void main(String [] args) {
		Animal a  = new Dog2();
		Dog2 d = new Dog2();
		d.eat();   // ok
		a.eat(); //  unreported exception Exception; must be caught or declared to be thrown
	}
}
