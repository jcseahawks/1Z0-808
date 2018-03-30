package tk.jcseahawks.ocja.day_nine.selftest;
// Fri Mar 30 05:18:52 EDT 2018
public class Electronic implements Device 
    { public void doIt() { } }
abstract class Phone1 extends Electronic { }

abstract class Phone2 extends Electronic
    { public void doIt(int x) { } }
class Phone3 extends Electronic implements Device 
    { public void doStuff() { } }
interface Device { public void doIt(); }
