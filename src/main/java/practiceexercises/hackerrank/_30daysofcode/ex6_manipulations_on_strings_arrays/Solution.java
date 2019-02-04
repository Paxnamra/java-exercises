package practiceexercises.hackerrank._30daysofcode.ex6_manipulations_on_strings_arrays;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

//      --- given an array of Strings manipulate it to divide odd and even index and print out letters of Strings in new order ---

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int countStrings = 0; countStrings < t; countStrings++) {
            String inputWords = scan.next();
            StringBuffer even = new StringBuffer();
            StringBuffer odd = new StringBuffer();

            for (int countOverString = 0; countOverString < inputWords.length(); countOverString++) {
                StringBuffer result = (countOverString % 2 == 0) ? even.append(inputWords.charAt(countOverString)) : odd.append(inputWords.charAt(countOverString));
            }
            System.out.print(even + " " + odd + "\n");
        }
        scan.close();
    }
}

/*
example input:

2
Hacker
Rank
*/



