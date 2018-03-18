package tk.jcseahawks.ocja.day_three;
//Sat Mar 17 08:59:01 EDT 2018
interface TestDefault{
   //legal declaration
   default int m1(){
       return 1;      
    }
   //legal declaration
   public default void m2(){
       ;
   }
   //illegal declaration : illegal combination of modifiers: static and default  
   static default void m3(){
       ;
   }
   //illegal declaration : missing method body, or declare abstract
   default void m4();
}
