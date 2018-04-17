package tk.jcseahawks.ocja.day_fourteen.chaptertwo;
// Mon Apr 16 18:50:01 EDT 2018
class Bar {
	void takeInt(int x) { }
}
class UseBar {
	public static void main(String [] args) {
		Bar b = new Bar();
		// b.takeInt(); // Try to invoke a no-arg takeInt() method
	}
}
