package tk.jcseahawks.ocja.day_nine.chaptertwo;
// Fri Mar 30 21:10:44 EDT 2018
class Foo {
	public int left = 9; // users of the class could exploit this
	public int right = 3; // users of the class could bypass setters
	public void setLeft(int leftNum) {
		left = leftNum;
		right = leftNum/3;
	}
	// Exam question could be formulated as:
	// Is the value of right always going to be one-third the value of left?
	// Not if set it's value directly through the public instance variable!!!
}
