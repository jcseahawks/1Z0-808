package tk.jcseahawks.day_two;

//order needs to be followed so static import wouldn't compile
import static java.lang.System.out;
import static java.lang.Integer.*;

public class TestStaticImport {
    public static void main(String[] args) {
        out.println(MAX_VALUE);
        out.println(toHexString(42));
    }
}