package tk.jcseahawks.ocja.day_thirteen.chaptertwo.exam_watch;
// Sun Apr 15 14:31:53 EDT 2018
class Foo { } // OK 
// class Bar implements Foo { } // No! Can't implement a class
interface Baz { } // OK
interface Fi { } // OK
// interface Zee implements Baz { } // No! interface can't implement another interface
// interface Zoo extends  Foo { } // No! interface can't extend a class
interface Boo extends Fi { } // OK
// class Toon extends Foo, Button { } // No; multiple inheritance
class Zoom implements Fi, Baz  { } // OK
interface Vroom extends Fi, Baz { } // OK
class Yow extends Foo implements Fi { } // OK
class Yow1 extends Foo implements Fi, Baz { } // OK
