# Oracle Certification Java Associate 1Z0-808 Exam Preparation
This is meant to be a 40 days learning streak with a commit per day
## Chapter 1 Two-Minute Drill
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
* There four access levels:
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


