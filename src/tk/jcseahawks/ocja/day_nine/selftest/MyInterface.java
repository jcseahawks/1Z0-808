package tk.jcseahawks.ocja.day_nine.selftest;
// Fri Mar 30 11:59:57 EDT 2018
interface MyInterface {
     // public static m1() { ; } // no return type
	default void m2() { ; } // ok
	abstract int m3(); // ok
     //	final short m4() { return 5; } //should be marked default or static
     // default long m5(); // missing body
	static void m6() { ; } // ok
}
