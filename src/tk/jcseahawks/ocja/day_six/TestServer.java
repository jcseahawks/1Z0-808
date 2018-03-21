package tk.jcseahawks.ocja.day_six;
// Tue Mar 20 20:27:31 EDT 2018
class TestServer {
     int count = 9; //Declare an instance variable named count
     public void login() {
         int count = 10; // a local variable must always be initialized
	 System.out.println("local variable count is " + count);
     }
    /* public void doSomething(int i) {
      count = i; // cannot find symbol count
     } */
     public void count() {
         System.out.println("instance variable count is " + count);
     }
     public static void main(String[] args) {
         new TestServer().login();
	 new TestServer().count();
     }
}
