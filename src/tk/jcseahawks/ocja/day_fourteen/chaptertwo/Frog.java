package tk.jcseahawks.ocja.day_fourteen.chaptertwo;
// Mon Apr 16 20:38:26 EDT 2018
class Frog {
	static int frogCount = 0; // Declare and initialize a static variable
	// int frogCount = 0; // non-static variable frogCount cannot be referenced from a static context
	Frog() {
		frogCount += 1; // Modify the value in the constructor
	}
	public static void main(String [] args) {
		new Frog();
		new Frog();
		new Frog();
		System.out.println("Frog count is now " + frogCount);
	}
}
