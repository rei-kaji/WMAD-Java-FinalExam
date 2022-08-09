package Problem1;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.function.Function;

public class MyImplementation {
    //The method takes a SupplyString functional interface. Define the input, return type and complete the body
    public static String generateARandomString(Supplier<String> supplierString) {
        // Add only one line of code here to use the functional interface
        return supplierString.get();
    }

    //The method takes a IntegerPredicate functional interface. Define the inputs, return type and complete the body
    public static boolean isInputValid(int x , IntPredicate y) {
        // Add only one line of code here to use the functional interface
        return y.test(x);
    }

    //The method takes a MapperFunction functional interface. Define the inputs, return type and complete the body
    public static Entity convertEntity(Entity entity, Function<Entity,Entity> mapperFunction ) {
        // Add only one line of code here to use the functional interface
        return mapperFunction.apply(entity);
    }
}
