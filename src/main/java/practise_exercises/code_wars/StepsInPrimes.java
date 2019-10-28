package practise_exercises.code_wars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepsInPrimes {

    public static long[] step(int g, long m, long n) {
        List<Long> primes = new ArrayList<>();

        for (long i = m; i <= n; i++) {
            if (probablyPrime(i)) {
                primes.add(i);
            }
        }
        return selectedPair(g, primes);
    }

    private static boolean probablyPrime(long number) {

        for (int i = 2; i < number; i++) {
            if ((number % i == 0)) {
                return false;
            }
        }
        return true;
    }

    private static long[] selectedPair(int range, List<Long> selection) {
        long[] pair = new long[2];

        for (long element : selection) {
            long searched = element + (long) range;

            while (selection.contains(searched)) {
                pair[0] = element;
                pair[1] = searched;
                return pair;
            }
        }
        //System.out.println("List elements: " + selection.toString()); //
        return pair;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(step(6, 100, 110)));
        System.out.println(Arrays.toString(step(8, 300, 400)));
        System.out.println(Arrays.toString(step(4, 30109, 30113)));
        System.out.println(Arrays.toString(step(2, 827537, 827539)));

        //Execution Timed Out (16000 ms)
        //xDDD
    }
}
