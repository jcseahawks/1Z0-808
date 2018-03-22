package tk.jcseahawks.ocja.day_seven;
// Wed Mar 21 20:45:47 EDT 2018
enum CoffeeSize {
  BIG(8),
  HUGE(10),
  OVERWHELMING(16) { // start a code block that defines the body for the constant
     public String getLidCode() { //override the default method
           return "A";
     }  
  }; // end of code block must end with semicolon if there is more code
  CoffeeSize(int ounces) {
     this.ounces = ounces;
  }
  private int ounces;
  public int getOunces() {
     return ounces;
  }
  public String getLidCode() { // default enum method that is being overriden by the constant
      return "B"; 
  }
}
