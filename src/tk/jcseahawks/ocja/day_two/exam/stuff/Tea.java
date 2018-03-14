package tk.jcseahawks.ocja.day_two.exam.stuff;

//5:32 PM 2018-03-14


import static java.lang.System.out;
import tk.jcseahawks.ocja.day_two.cert.Beverage;

class Tea extends Beverage {
      //"cannot be accessed from outside package import tk.jcseahawks.ocja.day_two.cert.Beverage;" compile time error.
      //this can be corrected by putting the super class Beverage in the same package as the sub class or by making Beverage public
      public static void main(String[] args){
         out.println("trying to achieve the impossible; importing a default access class from another package");
      }
}