package tk.jcseahawks.ocja.day_three;
// Sat Mar 17 11:50:06 EDT 2018
class Convertible extends SportsCar{
   // Invoking a method using a reference of the class 
   void doThings(){
     SportsCar sc = new SportsCar();
     sc.goFast();
   }
   // Invoking an inherited method
   void doMore(){
      goFast();
   }
}
