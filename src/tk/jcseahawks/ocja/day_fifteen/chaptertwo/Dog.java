package tk.jcseahawks.ocja.day_fifteen.chaptertwo;
// Tue Apr 17 21:12:27 EDT 2018
class Animal {
	static void doStuff() {
		System.out.println("a ");
	}
}
class Dog extends Animal {
	static void doStuff() { // not an override but a different method
		System.out.println("d ");
	} 
	public static void main(String [] args) {
		Animal [] a = {new Animal(), new Dog(), new Animal()};
		for(int x = 0; x < a.length; x++) {
			a[x].doStuff(); // invoke the static method on Animal reference
		}
		Dog.doStuff(); // invoke using the class name
	}
}
