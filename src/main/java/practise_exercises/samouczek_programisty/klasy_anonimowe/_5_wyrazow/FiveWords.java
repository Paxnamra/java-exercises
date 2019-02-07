package practise_exercises.samouczek_programisty.klasy_anonimowe._5_wyrazow;

import java.util.*;

public class FiveWords {

    public String[] getMultipleWords() {
        return multipleWords;
    }

    private String[] multipleWords;

    private String[] readInput() {
        System.out.println("Type 5 words; ");
        Scanner words = new Scanner(System.in);

        String[] multipleWords = new String[5];

        for (int i = 0; i <= multipleWords.length - 1; i++) {
            multipleWords[i] = words.next();

        }
        words.close();
        return multipleWords;
    }

    public FiveWords() {
        this.multipleWords = readInput();
    }

    @Override
    public String toString() {
        return Arrays.toString(multipleWords);
    }

    public static void main(String[] args) {

        FiveWords fiveWords = new FiveWords();
        String[] fiveWordsRef = fiveWords.getMultipleWords();

        List<String> fiveWo = new ArrayList<>();
        for (int i = 0; i < fiveWordsRef.length; i++) {
            String word = fiveWordsRef[i];
            fiveWo.add(word);
        }

        System.out.println("Przed sortowaniem: " + fiveWo);
        Collections.sort(fiveWo);
        System.out.println("Po sortowaniu: " + fiveWo);

        Collections.sort(fiveWo, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("\nPosortowane od najkrotszego slowa do najdluzszego: " + fiveWo);

    }
}