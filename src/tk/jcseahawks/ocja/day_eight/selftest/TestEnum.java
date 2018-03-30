package tk.jcseahawks.ocja.day_eight.selftest;
// Thu Mar 29 19:26:24 EDT 2018
enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	Animals(String s) { sound = s; }
}
class TestEnum {
	static Animals a;
	public static void main(String[] args) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound);
	}
}
