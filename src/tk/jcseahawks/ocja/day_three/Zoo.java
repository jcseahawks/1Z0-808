package tk.jcseahawks.ocja.day_three;
// Sat Mar 17 11:21:33 EDT 2018
class Zoo {
   public String coolMethod(){
       return "Wow baby";
   }
}
class Moo {
   public void useAZoo(){
       Zoo z = new Zoo();
       System.out.println("A Zoo says, " + z.coolMethod());
   }
}
