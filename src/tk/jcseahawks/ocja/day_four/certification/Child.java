package tk.jcseahawks.ocja.day_four.certification;
// Mon Mar 19 19:51:21 EDT 2018
class Child extends Parent {
static public void main(String[] args) {
   Child sc = new Child();
   sc.testIt();
}
public void testIt() {
    System.out.println("Variable x is " + x); // No problems;
}
}
