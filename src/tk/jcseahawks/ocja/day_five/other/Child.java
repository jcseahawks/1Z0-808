package tk.jcseahawks.ocja.day_five.other; //Different package
// Mon Mar 19 19:14:14 EDT 2018
import tk.jcseahawks.ocja.day_four.certification.Parent;
class Child extends Parent {
   public void testIt(){
       System.out.println("x is " + x); // No problem; Child inherits x
       Parent p = new Parent();
       System.out.println("X in parent is " + p.x); // x has protected access in Parent
   }
}
