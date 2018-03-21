package tk.jcseahawks.ocja.day_six;
// Tue Mar 20 19:19:47 EDT 2018
class Foo2 {
      // legal constructors
      Foo2() {}
      private Foo2(byte b) {}
      Foo2(int x) {}
      Foo2(int x, int... y) {}
      // illegal constructors
      void Foo2() {} // this is not a constructor, it's a legal method
      Foo() {} // invalid method declaration; return type required
      Foo2(short s); // missing method body, or declare abstract
      static Foo2(float f) {} // modifier static not allowed here
      final  Foo2(long x) {} // modifier final not allowed here
      abstract Foo2(char c) {} // modifier abstract not allowed here
      Foo2(int... x, int t) {} //vargs should be the last parameter
}
