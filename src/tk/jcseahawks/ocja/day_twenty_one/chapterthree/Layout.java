package tk.jcseahawks.ocja.day_twenty_one.chapterthree;

class Layout {                              // class
	static int s = 343;                 // static variable
	int x;                              // instance variable
	
	{                                   // initialization block
		x = 7;
		int x2 = 5;
	}
       
	Layout() {                          // constructor
		x += 8;
		int x3 = 6;
	}

	void doStuff() {                    // method
		int y = 0;                  // local variable
		for(int z =0; z < 4; z++) { // 'for' code block
			y += z + x;
		}
	}
}
