# Oracle Certification Java Associate 1Z0-808 Exam Preparation
This is meant to be a 40 days learning streak with a commit per day
## Chapter One Two-Minute Drill
### Java Features and Benefits
* Support for object-oriented programming model
* Encapsulation
* Automatic memory management
* Large API library
* Secure
* Multiplatform
* Strongly typed
* Multithreading
* Supports distributed computing
### Identifiers
* Must begin by either a letter, underscore, or a currency character
* Can be of any length
* Can never start with digits or any other special character but these can be used after first character
### Executable Java Files and main()
* Javac command-line program is used to compile, the *.java file extension needs to be included in the file name argument
* Java command-line program is used to execute compiled the *.class file generated from the above command, no need to include the file extension in the file name argument
* The only versions of main() methods with special powers are those version with method sigantures equivalent to `public static void main(String[] args)`
* main() can be overloaded
### Imports
* Java import statement's only job is to save keystrokes
* (*) wildcard can be used to search through a single package
* Static import syntax is `import static...`
* Import statement allows to import API classes and/or custom classes
### Source File Declaration Rules
* Only one public class per source file
* If source file contains a public class it's name should match public class's name
* `package` statement should be declared first if any and only one package statement is allowed
* `import` statement follows the `package` statement if any can be more than one
* `package` and `import` apply to all classes in the file
* There is no limit on non-public classes number in a source file
* No naming restrictions on source files with non-public classes
### Class Access Modifiers
* There are three access modifiers:
  * `public`
  * `protected`
  * `private`
* There are four access levels:
  * `public`
  * `protected`
  * `default`
  * `private`
* Outer classes can only be `default` and `public`
* A `default` class can only be seen by other classes in the same package
* A `public` class can be seen by all the universe
* Class visibility means:
  * Other classes can instatiate it
  * Other classes can extend it
  * Other can access it's members(methods and variables)
### Nonaccess Class Modifiers
* Classes can also be modified with:
  * `final`
  * `abstract`
  * `strictfp`
* A class cannot be both `final`(can't be subclassed) and `abstract`(can be subclassed but can't be instatiated)
* A single `abstract` method in a class means the whole class must be `abstract`
* An `abstract` class can have both abstract and nonabstract methods
* There is no minimum abstract method restriction for abstract classes
* The first concrete class to extend an abstract class must implement all of it abstract methods
### Interface Implementation
* Usually interfaces are contracts for what a class can do, without detailing how to do it
* Interfaces can be implemented by any class from any inheritence tree
* Interfaces are `abstract` implicitily and allow explicit `abstract` modifier too
* Usually interfaces have only `abstract` methods
* Interface methods are implicitly `public` and usually `abstract` but explicit modifiers are also allowed
* Interfaces can have constants, which are always implicitly `public`, `static`, `final` explicit declaration is also allowed in any combianation
* As of Java 8, interfaces can have static or default methods these must:
  * Provide concrete implementations
  * Follow all legal override rules for methods they implement
  * Not declare any new  or broader checked exceptions for an implementation method, runtime exceptions may be declared
  * Maintain the exact signature and return type of the method it implements; no need to declare the exception of the implemented interface
* A class implementing an interface can itself be `abstract`
* An `abstract` implementing class does not have to implement the interface methods
* A class can implement multiple interfaces
* Interfaces can extend one or more other interfaces
* Interfaces can not extend a class or implement a class or interface
* When taking the exam, verify legal interface and class declaration before verifying code logic
### Member Access Modifiers
* Members can use all four access modifiers
* Member access comes in two forms:
  * Code in one class can access a member of another class
  * A subclass can inherit a member of its superclass
* If a class can't be accessed its members won't be
* When taking the exam, verify class visibility before member visibility
* `public` members can be accessed by all other classes, even in other packages
* If a superclass member is `public`, the subclass inherits it regardless of package
* Members accessed without (.) operator must belong to the same class
* `this` always refers to currently executing object
* `this.aMethod()` is the same as just invoking directly `aMethod()`
* `private` members can be accessed only by code in the same class
* `private` members are not visible to subclasses, so `private` members cannot be inherited
* `default` and `protected` members differ only by when subclasses are involved:
  * `default` members can be accessed only by classes in the same package
  * `protected` members can be accessed by other classes in  the same package, plus subclasses, regardless of package
  * `protected` = package + kids (kids meaning subclasses)
  * For subclasses outside the package, the `protected` member can be accessed only through inheritence; a subclass outside the package cannot access a `protected` member by using a reference to a superclass instance.
  * A `protected` member inherited by a subclass from another package is not accessible to any other class in the subclass package, except for the the subclass's own subclasses
### Local Variables
* Local variables cannot have access modifiers
* `final` is the only modifier available to local variables
* Local variables must be initialized before use as they don't get default values
### Other Members Modifiers
* `final` methods cannot be overriden in a subclass
* `abstract` methods are declared with a signature, return type, and an optional throws clause, but they are not implemented
* `abstract` methods end in a semicolon
* Three ways to spot an nonabstract method:
  * The method is not marked `abstract`
  * The method has curly braces
  * The method <strong>MIGHT</strong> have code between the curly braces
* The first concrete class to extend an `abstract` class must implement all of the abstract class's `abstract` methods
* The `synchronized` modifier applies only to methods and code blocks only
* `synchronized` methods can have any access control and can also be marked `final`
* `abstract` methods must be implemented by a subclass, so they must be inheritable, hence `abstract` methods cannot be `private` nor `final`
* The `native` modifier applies only to methods
* The `strictfp` modifier applies to classes and methods only
### Methods with var-args
* Methods can declare a parameter that accepts from zero to many arguments, a so-called var-arg method
* A var-arg parameter is declared with the syntax `type... name`; for instance:
  * `doStuff(int... x){}`
* A var-arg method can have only one var-arg parameter
* In methods with normal parameters and var-arg, the var-arg must come last
### Constructors
* Constructors must have the same name as the class
* Constructors can have arguments, but they cannot have a return type
* Constructors can use any access modifier(even private!)
### Variable Declarations
* Instance variables can:
  * Have any access control
  * Be marked `final` or `transient`
* Instance variables can't be:
  * `abstract`
  * `synchronized`
  * `native`
  * `strictfp`
* A local variable can have the same name as an instance variable; this is called "shadowing"
* `final` variables have the following properties:
  * Cannot be reassigned once assigned a value
  * `final` reference variables cannot refer to a different object once the object has been assigned to the `final` variable
  * `final` variables must be initialized before the constructor completes
* There is no such thing as a `final` object only a `final` reference, the object can change
* The `transient` modifier applies only to instance variables (only makes sense during serialization)
* The `volatile` modifier applies only to instance variables
### Array Declarations
* Arrays can hold primitives or objects, but arrays are themeselves objects
* Brackets can be either on the left or the right of the variable at declaration
* It is never legal to include the size of an array in the declaration
* An array of objects holds elements of the same type or subclass of the declared type
### Static Variables and Methods
* They are not tied to any particular instance of a class
* No class instances are needed in order to use `static` members of the class or interface
* `static` methods do not have direct access to nonstatic members; a class instance must be created in order to access them
### enums
* An `enum` specifies a list of constants values assigned to a type
* An `enum` is a kind of a custom data type
* An `enum` constant's type is the `enum` type
* An `enum` can be declared outside or inside a class <strong>NOT</strong> in a method
* `enum`'s can contain constructors, methods, variables, and constant-specific class bodies
* `enum` constants can send arguments to the `enum` constructor
* `enum` constructors can have arguments and can be overloaded
* `enum` constructors can <strong>NEVER</strong> be invoked directly in code. They are always called automatically when an enum is initialized
* The semicolon at the end of an `enum` declaration is optional. These are legal:
  * `enum Foo { ONE, TWO, THREE } enum Foo { ONE, TWO, THREE };`
* `MyEnum.values()` returns an array of `MyEnum`'s values
## Chapter One SELF TEST
1. Which are true? (Choose all that apply.)
    1. `X extends Y` is correct if and only if and only if X is and Y is an interface
    2. `X extends Y` is correct if and only if X is an interface and Y is a class
    3. **`X extends Y` is correct if X and Y are either both classes or both interfaces**
    4. `X extends Y` is correct for all combinations of X and Y being classes and/or interfaces
2. Given: 

       class Rocket {
           private void blastOff() { System.out.print("bang "); }
       } 
       public class Shuttle extends Rocket { 
           public static void main(String[] args) {
               new Shuttle().go();
           } 
           void go() { 
               blastOff();
	       //Rocket.blastOff(); // line A
           }
           private void blastOff() { System.out.print("sh-bang "); } 
       }    

    Which are true? (Choose all that apply.)
      1. As the code stands, the output is bang
      2. <strong>As the code stands, the output is sh-bang</strong>
      3. As the code stands, compilation fails
      4. If line A is uncommented, the output is bang bang
      5. If line A is uncommented, the output is sh-bang bang
      6. <strong>If line A is uncommented, compilation fails</strong>
3. Given that the for loop's syntax is correct, and given:
  
       import static java.lang.System.*;
       class _ {
         static public void main(String[] __A_V_) {   
           String $ = "";
           for (int x=0; ++x < __A_V_.length;)  // for loop
	         $ += __A_V_[x];
	       out.println($);   
          } 
       }

   And the command line:

       java _ - A .

   What is the result?
     1. -A
     2. A.
     3. <strong>-A.</strong>
     4. _A.
     5. _-A.
     6. Compilation fails
     7. An exception is thrown at runtime
4. Given: 

       1. enum Animals {
       2.    DOG("woof"), CAT("meow"), FISH("burble");
       3.    String sound;
       4.    Animals(String s) { sound = s; }
       5. }
       6. class TestEnum {
       7.     static Animals a;
       8.     public static void main(String[] args) {
       9.         System.out.println(a.DOG.sound + " " + a.FISH.sound);
       10.    }
       11. }

   What is the result? (Choose all that apply.)

   1. **woof burble**
   2. Multiple compilation errors
   3. Compilation fails due to an error on line 2
   4. Compilation fails due to an error on line 3
   5. Compilation fails due to an error on line 4
   6. Compilation fails due to an error on line 9
5. Given two files:
       
       1. package pkgA;
       2. public class Foo {
       3.     int a = 5;
       4.     protected int b = 6;
       5.     public int c = 7;
       6. }
       
       3. package pkgB;
       4. import pkgA.*;
       5. public class Baz {
       6.     public static void main(String[] args) {
       7.         Foo f = new Foo();
       8.         System.out.print(" " + f.a);
       9.         System.out.print(" " + f.b);
       10.        System.out.println(" " + f.c);
       11.     }
       12. }

   What is the result? (Choose all that apply.)

   1. 5 6 7
   2. 5 followed by an exception
   3. Compilation fails with an error on line 7
   4. **Compilation fails with an error on line 8**
   5. **Compilation fails with an error on line 9**
   6. Compilation fails with an error on line 10
6. Given:

       1. public class Electronic implements Device
       2.     { public void doIt() { } }
       3. abstract class Phone1 extends Electronic { }
       4. 
       5. abstract class Phone2 extends Electronic 
       6.     { public void doIt(int x) { } }
       7. class Phone3 extends Electronic implements Device 
       8.     { public void doStuff() { } }
       9. interface Device { public void doIt(); }

   What is the result? (Choose all that apply.)    

   1. **Compilation succeeds**
   2. Compilation fails with an error on line 1
   3. Compilation fails with an error on line 3
   4. Compilation fails with an error on line 5
   5. Compilation fails with an error on line 7
   6. Compilation fails with an error on line 9
7. Given:

       4. class Announce {
       5.     public static void main(String[] args) {
       6.         for(int __x = 0; __x < 3; __x++) ;
       7.         int #lb = 7;
       8.         long [] x [5];
       9.         Boolean []ba[];
       10.    }
       11. }

   What is the result? (Choose all that apply.)

   1. Compilation succeeds
   2. Compilation fails with an error on line 6
   3. **Compilation fails with an error on line 7**
   4. **Compilation fails with an error on line 8**
   5. Compilation fails with an error on line 9
8. Given:

       3. public class TestDays {
       4.     public enum Days { MON, TUE, WED };
       5.     public static void main(String[] args) {
       6.         for(Days d : Days.values() )
       7.             ;
       8.         Days [] d2 = Days.values();
       9.         System.out.println(d2[2]);
       10.    }
       11. }

   What is the result? (Choose all that apply.)

   1. TUE
   2. **WED**
   3. The output is unpredictable
   4. Compilation fails due to an error on line 4
   5. Compilation fails due to an error on line 6
   6. Compilation fails due to an error on line 8
   7. Compilation fails due to an error on line 9
9. Given: 

       4. public class Frodo extends Hobbit {
       5.     public static void main(String[] args) {
       6.         int myGold = 7;
       7.         System.out.println(countGold(myGold, 6));
       8.     }
       9.  }
       10. class Hobbit {
       11.     int countGold(int x, int y) { return x + y; }
       12. }

   What is the result?

   1. 13
   2. Compilation fails due to multiple errors
   3. Compilation fails due to an error on line 6
   4. **Compilation fails due to an error on line 7**
   5. Compilation fails due to an error on line 11
10. Given:
     
       ```
       interface Gadget {
           void doStuff()
       }
       abstract class Electronic {
           void getPower() { System.out.print("plug in "); }
       }
       public class Tablet extends Electronic implements Gadget {
	        void doStuff() { System.out.print("show book "); }
	        public static void main(String[] args) {
	            new Tablet().getPower();
                new Tablet().doStuff();
	        } 
       }
       ```

    What are true? (Choose all that apply.)

    1. **The class Tablet will NOT compile**
    2. The interface Gadget will NOT compile
    3. The output will be <i>plug in show book</i>
    4. The abstract class Electronic will NOT compile
    5. The class Tablet CANNOT both extend and implement
11. Given that the Integer class is in java.lang package and given:

      ```
      1. // insert code here
      2. class StatTest {
      3.     public static void main(String[] args) {
      4.         System.out.println(Integer.MAX_VALUE);
      5.     }
      6. }
      ```

    Which, inserted independently at line 1, compiles? (Choose all that apply) 

    1. import static java.lang;
    2. import static java.lang.Integer;
    3. **import static java.lang.Integer.*;**
    4. static import java.lang.Integer.*;
    5. **import static java.lang.Integer.MAX_VALUE;**
    6. None of the above statements are valid import syntax
12. Given:

   ```
   interface MyInterface {
       // insert code here
   }
   ```



