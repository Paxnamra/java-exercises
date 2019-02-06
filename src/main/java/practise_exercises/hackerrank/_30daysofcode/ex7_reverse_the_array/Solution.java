package practise_exercises.hackerrank._30daysofcode.ex7_reverse_the_array;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        scanner.close();

//      --- given an array and number of its elements from Scanner the task was to revert it. Output shouldn't contain backets and colons ---

        int[] revertedArr = new int[n];
        for (int i = arr.length - 1; 0 <= i; i--) { // - 1
            int value = arr[i];
            revertedArr[arr.length - i - 1] = value;
        }

        // used regex here to get clean output
        String revertedArrAsString = Arrays.toString(revertedArr)
                .replaceAll("[^\\d\\S]", "")
                .replaceAll("[^\\d]", " ")
                .trim();

        System.out.println(revertedArrAsString);

        /*
        // without regex option
        String revertedArrAsString = Arrays.toString(revertedArr);
        System.out.println(revertedArrAsString
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .trim());
        */

/*
example inputs:
4
1 4 3 2

6
6 3 8 0 9 1

(you may need to hit enter twice to run it in the console)
*/

    }
}