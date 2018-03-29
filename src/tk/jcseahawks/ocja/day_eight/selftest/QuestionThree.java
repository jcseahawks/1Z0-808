package tk.jcseahawks.ocja.day_eight.selftest;
// Thu Mar 29 06:05:24 EDT 2018
import static java.lang.System.*;
class QuestionThree {
   static public void main(String[] args) {
      String $ = "";
      for(int x=0; ++x < args.length; ) // for loop
	      $ += args[x];
      out.println($);
   }
}

