package tk.jcseahawks.ocja.day_twenty_one.chapterthree;

class Casting {
	public static void main(String [] args) {
	//	long l = 56L;
		long l = 130L;
		byte b = (byte)l;
	//	int x = 3957.229;  // illegal
		int x = (int)3957.229;  // legal
		System.out.println("The byte is " + b);
	//	System.out.println("Integer x is " + x);
	}
}
