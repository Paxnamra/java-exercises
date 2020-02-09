package practise_exercises.code_wars;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class DragonsCurve {
    /**
     * Make the function; map the chars to Strings
     * a -> aRbFR, b -> LFaLb, otherwise -> itself
     */
    public IntFunction<String> mapFunction = s -> s == 'a' ? "aRbFR" : s == 'b' ? "LFaLb" : Character.toString((char) s);

    /**
     * Make the curve; stream the chars repeatedly (starting with Fa) through the mapFunction n times
     * Then remove the a and b (createFilter function is useful for that)
     */
    public String createCurve(int n) {
        String generate = "Fa";

        while (n > 0) {
            generate = generate.chars().mapToObj(ch -> mapFunction.apply(ch)).collect(Collectors.joining(""));
            n--;
        }
        return generate.chars()
                .filter(createFilter('a', false))
                .filter(createFilter('b', false))
                .mapToObj(ch -> String.valueOf((char) ch))
                .collect(Collectors.joining());
    }

    /**
     * How many of the specified char are in the given curve?
     * Hint: createFilter could be useful for this
     */
    public long howMany(char c, String curve) {
        return curve.chars().filter(createFilter(c, true)).count();
    }

    /**
     * Create a predicate to filter the specified char; keep or remove based on keep variable
     */
    public IntPredicate createFilter(char filterWhat, boolean keep) {
        return ch -> keep == (filterWhat == ch);
    }

    public static void main(String[] args) {
        DragonsCurve dc = new DragonsCurve();
        System.out.println(dc.createCurve(6));
    }
}
