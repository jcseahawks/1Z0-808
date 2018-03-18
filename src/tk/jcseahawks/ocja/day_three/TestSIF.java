package tk.jcseahawks.ocja.day_three;
//Sat Mar 17 09:23:59 EDT 2018
interface StaticIface {
     // legal declaration
     static int m1(){
         return 42;
     }
     // legal declaration
     public static void m2(){
         ;
     }
     // illegal declaration: modifier final not allowed here
     // final static void m3(){
     //    ;
     // }
     // illegal declaration: interface abstract methods cannot have body
     // abstract static void m4(){
     //   ;
     // }
     // illegal declaration: missing body, or declare abstract
     //static void m5();
}

public class TestSIF implements StaticIface {
      public static void main(String[] args){
          System.out.println(StaticIface.m1()); // legal: m1()'s type must be included

	  new TestSIF().go();

	  // System.out.println(m1()); // illegal: reference to interface is required
      }

      void go() {
         System.out.println(StaticIface.m1()); // also legal from an instance
      }

}
