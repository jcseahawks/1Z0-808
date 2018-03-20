package tk.jcseahawks.ocja.day_five.other;
class SubClass extends SuperClass {
   public void showSample() {
      System.out.println("Another thing"); // cannot override method; overridden method is final
   }
}
