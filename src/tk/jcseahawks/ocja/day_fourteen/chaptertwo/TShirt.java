package tk.jcseahawks.ocja.day_fourteen.chaptertwo;
// Mon Apr 16 19:12:08 EDT 2018
class Clothing {
	Clothing(String s) { }
}
class TShirt extends Clothing {
	TShirt(String s) {
		// super(); // constructor Clothing in class Clothing cannot be applied to given types
		super(s);
	}
}
