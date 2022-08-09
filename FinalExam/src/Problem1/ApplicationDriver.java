package Problem1;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.function.Supplier;

public class ApplicationDriver {
    public static void main(String[] args) {
        //replace * with a proper lambda expression based not note 1 above.
        String s = MyImplementation.generateARandomString (()->{
            ArrayList<String> ki = new ArrayList<>();
            ki.add("a");
            ki.add("b");
            ki.add("c");
            ki.add("d");
            return String.valueOf(ki);
        });
        System.out.println(s);


        int number = 10;
        //replace * with a proper lambda expression based on note 2 above.
        Boolean valid = MyImplementation.isInputValid(number,(x)->{
            if (x / 2 == 0) {
                return false;
            }
            return true;
        });
        System.out.println(number + " is " + valid);

        char[] chars = new char[1];
        chars[0] = 'A';
        Entity e = new Entity("REI",1,chars);

        //replace * with a proper regular expression based on note 3 above.
        Entity ae = MyImplementation.convertEntity (e, (a)->{return a;});
        System.out.println(ae);
    }
}

