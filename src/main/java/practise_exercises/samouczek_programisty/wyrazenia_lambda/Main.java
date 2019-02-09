package practise_exercises.samouczek_programisty.wyrazenia_lambda;

//Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::).

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        BiFunction<Integer, String, Human> human = Human::new;
        System.out.println(human.apply(20,"Dooopa"));

        }
}
