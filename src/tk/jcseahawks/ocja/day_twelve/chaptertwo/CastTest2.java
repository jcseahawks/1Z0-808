package tk.jcseahawks.ocja.day_twelve.chaptertwo;
// Sat Apr 14 12:15:23 EDT 2018
class Animal {
	void makeNoise() {
		System.out.println("generic noise");
	}
}
class Dog extends Animal implements Pet {
	void makeNoise() {
		System.out.println("bark");
	}
	void playDead() {
		System.out.println("roll over");
	}
	public void beFriendly() {
		System.out.println("friendly");
	} 
}
class Beagle extends Dog {
}
interface Pet {
	void beFriendly();
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
	// String s = (String) animal; // incompatible types: Animal cannot be converted to String
	Dog d = (Dog) animal; // compiles but blows up at runtime with java.lang.ClassCastException: Animal cannot be cast to Dog
	Beagle b = new Beagle();
	Animal a1 = d; // upcast ok with no explicit cast
	Animal a2 = (Animal) d; // upcast ok with an explicit cast
	Pet p = (Pet) animal; // ok but only pet's methods can be invoked
	Pet p1 = (Pet) b; //ok because Beagle is implicitly a pet through Dog

}
}
