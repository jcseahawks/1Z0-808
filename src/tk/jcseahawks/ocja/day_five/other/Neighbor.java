package tk.jcseahawks.ocja.day_five.other;
// Mon Mar 19 19:33:04 EDT 2018
class Neighbor {
    public void testIt() {
        Child c = new Child();      
	System.out.println("X in child is " + c.x); //x has protected access in Parent
    }
}
