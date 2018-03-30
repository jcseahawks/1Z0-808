package tk.jcseahawks.ocja.day_nine.selftest;
// Fri Mar 30 08:46:15 EDT 2018
public class Frodo extends Hobbit {
	public static void main(String[] args) {
		int myGold = 7;
		System.out.println(countGold(myGold, 6));
	}
}
class Hobbit {
	int countGold(int x, int y) { return x + y;  }
}
