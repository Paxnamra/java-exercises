package practise_exercises.samouczek_programisty.wyrazenia_lambda.sort_4_wyrazy;

import java.util.*;

public class FourWords {

    private List<String> userInput;

    public FourWords() {
        this.userInput = readInput();
    }

    public List<String> readInput() {
        System.out.println("Type 4 words :");

        userInput = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4 ; i++ ){
            userInput.add(scan.next());

        }
        scan.close();
        return userInput;
    }

    @Override
    public String toString() {
        return userInput.toString();
    }

    public static void main(String[] args) {

        FourWords fourWo = new FourWords();

        System.out.println("Unsorted: " + fourWo);
        fourWo.userInput.sort((String o1, String o2) -> o1.length() - o2.length());

        System.out.println("Sorted: " + fourWo);
    }
}
