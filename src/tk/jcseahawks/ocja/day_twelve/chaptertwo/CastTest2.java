package tk.jcseahawks.ocja.day_twelve.chaptertwo;
// Sat Apr 14 12:15:23 EDT 2018
class Animal {
	void makeNoise() {
		System.out.println("generic noise");
	}
}
class Dog extends Animal {
	void makeNoise() {
		System.out.println("bark");
	}
	void playDead() {
		System.out.println("roll over");
	}
}
class CastTest2 {
	public static void main(String [] args) {
		Animal [] a = {new Animal(), new Dog(), new Animal()};
		for(Animal animal : a) {
			animal.makeNoise();
			if(animal instanceof Dog) {
				// animal.playDead(); //cannot find symbol playDead()
				Dog d = (Dog) animal; // casting the ref. var.
				d.playDead();
			}
		}
	}
}
class DogTest {
public static void main(String [] args) {
	Animal animal = new Animal();
	// String s = (String) animal; incompatible types: Animal cannot be converted to String
	Dog d = (Dog) animal; // compiles but blows up at runtime with java.lang.ClassCastException: Animal cannot be cast to Dog
}
}
