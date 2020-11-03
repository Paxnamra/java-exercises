package practise_exercises.code_wars;

public class StringSplit {
    public static String[] solution(String s) {
        s = (s.length() % 2 == 0) ? s : s + "_";
        String[] charPairs = new String[s.length() / 2];
        int arrIndex = 0;

        for (int i = 0, j = 0; i < s.length(); i += 2) {
            j += 2;

            if (j > s.length()) {
                j -= 1;
            }

            charPairs[arrIndex] = s.substring(i, j);
            arrIndex++;
        }

        return charPairs;
    }
}


