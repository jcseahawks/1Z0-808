package tk.jcseahawks.ocja.day_three;
// Sat Mar 17 11:33:10 EDT 2018
class Zoo {
     public String coolMethod() {
          return "Wow baby";
     }
}
class Moo extends Zoo {
      public void useMyCoolMethod(){
        System.out.println("Moo says, " + this.coolMethod());
        Zoo z = new Zoo();
        System.out.println("Zoo says, " + z.coolMethod());
      }
}
