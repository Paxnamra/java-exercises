package practiceexercises.hackerrank._30daysofcode.Ex12;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();

        System.out.println("Grade: " + s.calculate());
    }
}

/* --- Input examples to pass through scanner ---

Heraldo Memelli 8135627
4
50 80 30 100

Heraldo Memelli 8135627
8
50 80 50 100 80 75 35 95

*/

