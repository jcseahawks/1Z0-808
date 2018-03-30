package tk.jcseahawks.ocja.day_nine.selftest;
// Fri Mar 30 06:22:18 EDT 2018
public class TestDays {
	public enum Days { MON, TUE, WED };
	public static void main(String[] args) {
		for(Days d : Days.values())
			;
		Days [] d2 = Days.values();
		System.out.println(d2[2]);
	}
}
