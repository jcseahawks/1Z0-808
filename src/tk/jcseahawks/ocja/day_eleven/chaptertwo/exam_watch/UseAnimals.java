package tk.jcseahawks.ocja.day_eleven.chaptertwo.exam_watch;
// Sun Apr  1 16:30:48 EDT 2018
class Animal { 
	public void eat() {
		System.out.println("Generic Aniamal Eating Generically");
	}
}
class Horse extends Animal { 
	public void eat() {
		System.out.println("Horse eating hay ");
	}
	public void eat(String s) {
		System.out.println("Horse eating " + s);
	}
}
class UseAnimals {
	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}
	public void doStuff(Horse h) {
		System.out.println("In the Horse version");
	}
	public static void main(String [] args) {
		UseAnimals ua = new UseAnimals();
		Animal animalObj = new Animal();
		Animal animalRefToHorse = new Horse();
		Horse horseObj = new Horse();
		ua.doStuff(animalObj);
		ua.doStuff(horseObj);
		ua.doStuff(animalRefToHorse);
		animalObj.eat(); // Generic Animal Eating Generically
		horseObj.eat(); // Horse eating hay
		animalRefToHorse.eat(); //Horse eating hay
		horseObj.eat("Apples"); //Horse eating Apples
		// animalObj.eat("treats"); //Compiler Error
		// animalRefToHorse.eat("Carrots"); //actual and formal argument lists differ in length
	}
}
