package tk.jcseahawks.ocja.day_seven;
// Wed Mar 21 19:44:21 EDT 2018
class Coffee2 {
   enum CoffeeSize { BIG, HUGE, OVERWHELMING }
   CoffeeSize size;
}
public class CoffeeTest2 {
    public static void main(String[] args) {
       Coffee2 drink = new Coffee2();
       drink.size = Coffee2.CoffeeSize.BIG; // enclosing class name required
    }
}
