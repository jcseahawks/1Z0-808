package tk.jcseahawks.ocja.day_seven;
// Wed Mar 21 18:36:05 EDT 2018
final class Foo {
   int size = 27;
   public void setSize(int size) {
       this.size = size; //this means the current object's instance variable vs parameter's
   }
}
// class Bar extends Foo { // cannot inherit from final Foo class
// }
