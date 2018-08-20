package tk.jcseahawks.ocja.day_twenty_one.chapterthree;

public class Foo {
	public void doFooStuff() {
	}
}

public class Bar extends Foo {
	public void doBarStuff() {
	}
}

class Test {
	public static void main (String [] args) {
		Foo reallyABar = new Bar();    // Legal because Bar is a subclass of Foo
//		Bar reallyAFoo = new Foo();    // Illegal! Foo is not a subclass of Bar
	}
}
