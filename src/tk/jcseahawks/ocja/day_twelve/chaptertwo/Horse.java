package tk.jcseahawks.ocja.day_twelve.chaptertwo;
// Sat Apr 14 11:27:54 EDT 2018
class Animal {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
}
public class Horse extends Animal {
	public void eat() {
		System.out.println("Horse eating hay ");
	}
	public void eat(String s) {
		System.out.println("Horse eating " + s);
	}
	public static void main(String [] args) {
		Animal a = new Animal();
		a.eat(); // Generic Animal Eating Generically
		Horse h = new Horse();
		h.eat(); // Horse eating hay
		Animal ah = new Horse();
		ah.eat(); // Horse eating hay
		Horse he = new Horse();
		he.eat("Apples"); // Horse eating Apples
		Animal ah2 = new Horse();
		// ah2.eat("Carrots"); // Compilation Error; method eat in class Animal..
	}
}
