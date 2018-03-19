package tk.jcseahawks.ocja.day_four.somethingElse;
// Sun Mar 18 20:55:21 EDT 2018
import tk.jcseahawks.ocja.day_four.certification.OtherClass;
class AccessClass {
   static public void main(String[] args) {
      OtherClass o = new OtherClass();
      o.testIt(); // cannot be accessed from outside package
   }
}
