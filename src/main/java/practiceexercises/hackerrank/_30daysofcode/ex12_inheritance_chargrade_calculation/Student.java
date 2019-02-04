package practiceexercises.hackerrank._30daysofcode.ex12_inheritance_chargrade_calculation;

public class Student extends Person {

//   --- the exact part of exercise was to provide Student.class with method calculating grade
//       depending on average of typed in several scores ---

    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate() {
        int arrayVal = 0;
        for (int testScore : testScores) {
            arrayVal = arrayVal + testScore;
        }

        int average = arrayVal / testScores.length;

//      --- refactored, typical combination of else-if loops looked incredibly ugly ---
//      --- ternary operators' mix seems an efficient way here to print grade ---
        return 90 <= average ? 'O'
                : 80 <= average ? 'E'
                : 70 <= average ? 'A'
                : 55 <= average ? 'P'
                : 40 <= average ? 'D'
                : 'T';

    }
}
