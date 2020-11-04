package practise_exercises.code_wars;

public class StringSplit {
    public static String[] solution(String s) {
        s = (s.length() % 2 == 0) ? s : s + "_";
        String[] charPairs = new String[s.length() / 2];
        int k = 0;

        for (int i = 0, j = 0; i < s.length(); i += 2) {
            j = (j > s.length()) ? j - 1 : j + 2;

            charPairs[k] = s.substring(i, j);
            k++;
        }

        return charPairs;
    }
}




