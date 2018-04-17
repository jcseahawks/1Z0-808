package tk.jcseahawks.ocja.day_fourteen.chaptertwo;
// Mon Apr 16 18:59:58 EDT 2018
class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	Animal() {
		this(makeRandomName());
	}
	static String makeRandomName() {
		int x = (int) (Math.random() * 5);
		String name = new String[] {"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];
		return name;
	}
	public static void main(String [] args) {
		Animal a = new Animal();
		System.out.println(a.name);
		Animal b = new Animal("Zeus");
		System.out.println(b.name);
	}
}
class Horse extends Animal {
	Horse() {
		// super(); // constructor Animal in class Animal cannot be applied to given types
	}
}
