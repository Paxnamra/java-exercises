package practiceexercises.hackerrank._30daysofcode.ex6_manipulations_on_strings;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static final Scanner sc = new Scanner(System.in);

    public static void printArrays(String input) {
        char[] stringAsChars = input.toCharArray();
        char[] oddIndex = new char[stringAsChars.length - 1];
        char[] evenIndex = new char[stringAsChars.length - 1];

        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < input.length(); i++) {
            char temp = '\u0000';
            if ((i == 0) || (i % 2 == 0)) {
                temp = stringAsChars[i];
                evenIndex[countEven] = temp;
                ++countEven;
            } else {
                temp = stringAsChars[i];
                oddIndex[countOdd] = temp;
                ++countOdd;
            }
        }
        System.out.println(Arrays.toString(evenIndex)
                .replaceAll("([\\]\\[\\,\\s])","")
                + " "
                + Arrays.toString(oddIndex)
                .replaceAll("([\\]\\[\\,\\s])",""));
    }

    public static void main(String[] args) {

        printArrays("Hacker");
        printArrays("Rank");

    }
}


/*
2
Hacker
Rank
*/


