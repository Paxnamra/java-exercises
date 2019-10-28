package practise_exercises.code_wars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StepsInPrimesTest {

    @Test
    public void step() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(StepsInPrimes.step(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(StepsInPrimes.step(4,100,110)));
        assertEquals("[101, 107]", Arrays.toString(StepsInPrimes.step(6,100,110)));
        assertEquals("[359, 367]", Arrays.toString(StepsInPrimes.step(8,300,400)));
        assertEquals("[307, 317]", Arrays.toString(StepsInPrimes.step(10,300,400)));
    }
}
