package tk.jcseahawks.ocja.day_seven;
// Wed Mar 21 19:28:45 EDT 2018
enum CoffeeSize { BIG, HUGE, OVERWHELMING } //this cannot be private or protected
class Coffee {
    CoffeeSize size;
}
public class CoffeeTest1 {
     public static void main(String[] args) {
    // enum CoffeeSize { BIG, HUGE, OVERWHELMING } // enum types must not be local
       Coffee drink = new Coffee();
       drink.size = CoffeeSize.BIG;  //enum outside class
       System.out.println(drink.size);
     }
}
