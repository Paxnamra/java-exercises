package practise_exercises.code_wars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepsInPrimes {

    public static long[] step(int g, long m, long n) {
        List<Long> primes = new ArrayList<>();

        for (long i = m; i < n; i++) {
            if (ifPrime(i)) {
                primes.add(i);
            }
        }
        return selectedPair(g, primes);
    }

    private static boolean ifPrime(long number) {
        int squared = (int) Math.sqrt(number);

        for (int i = 2; i <= squared; i++) {
            if ((number % i == 0)) {
                return false;
            }
        }
        return true;
    }

    private static long[] selectedPair(int range, List<Long> selection) {

        for (long element : selection) {
            long searched = element + (long) range;

            while (selection.contains(searched)) {
                long[] pair = new long[2];
                pair[0] = element;
                pair[1] = searched;
                return pair;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(step(6, 100, 110)));
        System.out.println(Arrays.toString(step(8, 300, 400)));
        System.out.println(Arrays.toString(step(4, 30109, 30113)));
        System.out.println(Arrays.toString(step(2, 827537, 827539)));
    }
}
