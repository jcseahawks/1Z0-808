package tk.jcseahawks.ocja.day_eleven.chaptertwo.exam_watch;
// Sun Apr  1 10:51:57 EDT 2018
import java.io.*;
public class Foo {
	public void doStuff(int y, String s) { }
	public void moreThings(int x) { }
}
class Bar extends Foo {
	public void doStuff(int y, long s) throws IOException { } // ok
}
