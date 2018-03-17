package tk.jcseahawks.ocja.day_three;

//Sat Mar 17 08:09:26 EDT 2018
import tk.jcseahawks.ocja.day_three.Bounceable;

class Tire implements Bounceable {
      public void bounce(){
          System.out.println("Bouncing");
      }
      public void setBounceFactor(int bf){
           System.out.println("Setting bf to " + bf);
      }
}
