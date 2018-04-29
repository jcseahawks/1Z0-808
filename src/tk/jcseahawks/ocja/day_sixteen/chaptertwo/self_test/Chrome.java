package tk.jcseahawks.ocja.day_sixteen.chaptertwo.self_test;
// Sat Apr 28 20:09:03 EDT 2018
class X { void do1() {} }
class Y extends X { void do2() {} }
class Chrome {
	public static void main(String [] args) {
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		// x2.do2();
		// (Y)x2.do2();
		((Y)x2).do2();
	}
}
