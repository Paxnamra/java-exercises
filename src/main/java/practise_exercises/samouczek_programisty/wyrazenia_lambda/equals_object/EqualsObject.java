package practise_exercises.samouczek_programisty.wyrazenia_lambda.equals_object;

import java.util.function.Function;
import java.util.function.Supplier;

public class EqualsObject {
    public static void main(String[] args) {

        System.out.println("Traditional approach: ");
        Object instance = new Object();
        Object instance2 = new Object();
        instance.equals(instance2);
        System.out.println(instance.equals(instance2));

        System.out.println("\nFunctional approach: ");
        Supplier<Object> objectInstance = Object::new;
        Supplier<Object> objectInstance2 = Object::new;

        Function<Object, Boolean> compare = object -> {
            if (objectInstance.equals(objectInstance2)) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println(compare.apply(objectInstance));
    }
}

