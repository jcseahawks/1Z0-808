package tk.jcseahawks.ocja.day_fourteen.chaptertwo;
// Mon Apr 16 19:58:39 EDT 2018
class SmallInit {
	static int x;
	int y;
	static { x = 7; } // static init block
	{ y = 8; }     // instance init block
}
